package webservice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class OrderService {
	
	private Log logger = LogFactory.getLog(this.getClass().getName());
	
	public Message modifyOrder(Order_Head[] heads,Order_Item[] items){
		if(heads !=null){
			logger.info("Heads size = "+heads.length);
		}else{
			logger.info("Heads is null");
		}
		if(items !=null){
			logger.info("Items size = "+items.length);
		}else{
			logger.info("Items is null");
		}
		OrderEventHandler event = new OrderEventHandler();
		event.setDataSource();
		return event.modifyOrder(heads,items);
	}

}
