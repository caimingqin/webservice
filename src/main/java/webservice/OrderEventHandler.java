package webservice;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class OrderEventHandler {

	private Log logger = LogFactory.getLog(this.getClass().getName());
	private JdbcTemplate jdbcTemplate = null;
	private PlatformTransactionManager transactionManager;

	private String insertOrderHead = "INSERT INTO ORDER_HEAD(ZDATI, BSTKD, VKORG_O, VKORG_N, VTWEG_O, VTWEG_N, SPART_O, SPART_N, "
			+ " VKBUR_O, VKBUR_N, VKGRP_O, VKGRP_N, KUNAG_O, KUNAG_N, KUNWE_O, KUNWE_N, KUNRG_O, KUNRG_N, BSTKD_E, OperType) "
			+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	private String insertOrderItem = "INSERT INTO ORDER_ITEM(ZDATI, BSTKD, MATNR_S_O, MATNR_S_N, KWMENG_O, KWMENG_N, "
			+ " EDATU_O, EDATU_N, KBETR_O, KBETR_N, KWERT_O, KWERT_N, OperType) "
			+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	public void setDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");
		ds.setUrl("jdbc:jtds:sqlserver://192.168.90.22:49191;databasename=DMSDB_Z");
		ds.setUsername("DMSTEST");
		ds.setPassword("dmstest001");
		this.jdbcTemplate = new JdbcTemplate(ds);
		this.transactionManager = new DataSourceTransactionManager(ds);
	}
	
	private TransactionStatus beforeHandle() {
		DefaultTransactionDefinition dtd = new DefaultTransactionDefinition();
		dtd.setTimeout(30);
		dtd.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		return this.transactionManager.getTransaction(dtd);
	}

	public void saveOrder(final Order_Head[] heads,final Order_Item[] items) {
		this.jdbcTemplate.batchUpdate(insertOrderHead,
				new BatchPreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement ps, int i)
							throws SQLException {
						Order_Head head = heads[i];
						ps.setString(1, head.getZDATI());
						ps.setString(2, head.getBSTKD());
						ps.setString(3, head.getVKORG_O());
						ps.setString(4, head.getVKORG_N());
						ps.setString(5, head.getVTWEG_O());
						ps.setString(6, head.getVTWEG_N());
						ps.setString(7, head.getSPART_O());
						ps.setString(8, head.getSPART_N());
						ps.setString(9, head.getVKBUR_O());
						ps.setString(10, head.getVKBUR_N());
						ps.setString(11, head.getVKGRP_O());
						ps.setString(12, head.getVKGRP_N());
						ps.setString(13, head.getKUNAG_O());
						ps.setString(14, head.getKUNAG_N());
						ps.setString(15, head.getKUNWE_O());
						ps.setString(16, head.getKUNWE_N());
						ps.setString(17, head.getKUNRG_O());
						ps.setString(18, head.getKUNRG_N());
						ps.setString(19, head.getBSTKD_E());
						ps.setString(20, head.getOperType());
					}
		
					@Override
					public int getBatchSize() {
						return heads.length;
					}
				});

		this.jdbcTemplate.batchUpdate(insertOrderItem,
				new BatchPreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement ps, int i)
							throws SQLException {
						Order_Item item = items[i];
						ps.setString(1, item.getZDATI());
						ps.setString(2, item.getBSTKD());
						ps.setString(3, item.getMATNR_S_O());
						ps.setString(4, item.getMATNR_S_N());
						ps.setString(5, item.getKWMENG_O());
						ps.setString(6, item.getKWMENG_N());
						ps.setString(7, item.getEDATU_O());
						ps.setString(8, item.getEDATU_N());
						ps.setString(9, item.getKBETR_O());
						ps.setString(10, item.getKBETR_N());
						ps.setString(11, item.getKWERT_O());
						ps.setString(12, item.getKWERT_N());
						ps.setString(13, item.getOperType());
					}

					@Override
					public int getBatchSize() {
						return items.length;
					}
				});
	}
	
	private void rollbackOnException(TransactionStatus status, Throwable ex) throws TransactionException {
		ex.printStackTrace();
		try {
			this.transactionManager.rollback(status);
		}
		catch (TransactionSystemException ex2) {
			ex2.printStackTrace();
			ex2.initApplicationException(ex);
			throw ex2;
		}
		catch (RuntimeException ex2) {
			ex.printStackTrace();
			throw ex2;
		}
		catch (Error err) {
			ex.printStackTrace();
			throw err;
		}
	}
	
	public Message modifyOrder(Order_Head[] heads,Order_Item[] items){
		

		String result = "S";
		Exception e = null;
		TransactionStatus status = null;
		try {
			status = beforeHandle();
			saveOrder(heads,items);
		}catch(RuntimeException re){
			e = re;
			result = "E";
		}
		finally{
			try {
				if(e != null){
					logger.error("rollback");
					rollbackOnException(status,e);
				}
				else{
					logger.info("commit");
					transactionManager.commit(status);
				}
			}
			catch(TransactionException te){
				e = te;
				result = "E";
			}
		}
		return new Message(result,e!=null?e.toString():"");
	}

}
