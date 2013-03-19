package webservice;
public class Order_Item implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ZDATI;      //Current date
	private String BSTKD;      //DMS order NO.===
	private String MATNR_S_O;  //SKU===
	private String MATNR_S_N;   //======
	private String KWMENG_O;   //Order Quantity===
	private String KWMENG_N; 
	private String EDATU_O;    //Dellivery Date
	private String EDATU_N;
	private String KBETR_O;    //Unit price of contract===
	private String KBETR_N;
	private String KWERT_O;    //Unit price of sales=====
	private String KWERT_N;
	private String OperType;
	
	public String getZDATI() {
		return ZDATI;
	}
	public void setZDATI(String zDATI) {
		ZDATI = zDATI;
	}
	public String getBSTKD() {
		return BSTKD;
	}
	public void setBSTKD(String bSTKD) {
		BSTKD = bSTKD;
	}
	public String getMATNR_S_O() {
		return MATNR_S_O;
	}
	public void setMATNR_S_O(String mATNR_S_O) {
		MATNR_S_O = mATNR_S_O;
	}
	public String getMATNR_S_N() {
		return MATNR_S_N;
	}
	public void setMATNR_S_N(String mATNR_S_N) {
		MATNR_S_N = mATNR_S_N;
	}
	public String getKWMENG_O() {
		return KWMENG_O;
	}
	public void setKWMENG_O(String kWMENG_O) {
		KWMENG_O = kWMENG_O;
	}
	public String getKWMENG_N() {
		return KWMENG_N;
	}
	public void setKWMENG_N(String kWMENG_N) {
		KWMENG_N = kWMENG_N;
	}
	public String getEDATU_O() {
		return EDATU_O;
	}
	public void setEDATU_O(String eDATU_O) {
		EDATU_O = eDATU_O;
	}
	public String getEDATU_N() {
		return EDATU_N;
	}
	public void setEDATU_N(String eDATU_N) {
		EDATU_N = eDATU_N;
	}
	public String getKBETR_O() {
		return KBETR_O;
	}
	public void setKBETR_O(String kBETR_O) {
		KBETR_O = kBETR_O;
	}
	public String getKBETR_N() {
		return KBETR_N;
	}
	public void setKBETR_N(String kBETR_N) {
		KBETR_N = kBETR_N;
	}
	public String getKWERT_O() {
		return KWERT_O;
	}
	public void setKWERT_O(String kWERT_O) {
		KWERT_O = kWERT_O;
	}
	public String getKWERT_N() {
		return KWERT_N;
	}
	public void setKWERT_N(String kWERT_N) {
		KWERT_N = kWERT_N;
	}
	public String getOperType() {
		return OperType;
	}
	public void setOperType(String operType) {
		OperType = operType;
	}
	
}
