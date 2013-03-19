package webservice;
public class Order_Head implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ZDATI;      //Current date
	private String BSTKD;      //DMS order NO.
	private String VKORG_O;    //Head
	private String VKORG_N;   
	private String VTWEG_O;    //Channel
	private String VTWEG_N;   
	private String SPART_O;    //Category
	private String SPART_N;
	private String VKBUR_O;    //Area
	private String VKBUR_N;
	private String VKGRP_O;    //Office
	private String VKGRP_N;
	private String KUNAG_O;    //Sold-to Party====
	private String KUNAG_N;
	private String KUNWE_O;    //Ship-to Party=====
	private String KUNWE_N;
	private String KUNRG_O;    //Payer=====
	private String KUNRG_N;
	private String BSTKD_E;    //PO NO.
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
	public String getVKORG_O() {
		return VKORG_O;
	}
	public void setVKORG_O(String vKORG_O) {
		VKORG_O = vKORG_O;
	}
	public String getVKORG_N() {
		return VKORG_N;
	}
	public void setVKORG_N(String vKORG_N) {
		VKORG_N = vKORG_N;
	}
	public String getVTWEG_O() {
		return VTWEG_O;
	}
	public void setVTWEG_O(String vTWEG_O) {
		VTWEG_O = vTWEG_O;
	}
	public String getVTWEG_N() {
		return VTWEG_N;
	}
	public void setVTWEG_N(String vTWEG_N) {
		VTWEG_N = vTWEG_N;
	}
	public String getSPART_O() {
		return SPART_O;
	}
	public void setSPART_O(String sPART_O) {
		SPART_O = sPART_O;
	}
	public String getSPART_N() {
		return SPART_N;
	}
	public void setSPART_N(String sPART_N) {
		SPART_N = sPART_N;
	}
	public String getVKBUR_O() {
		return VKBUR_O;
	}
	public void setVKBUR_O(String vKBUR_O) {
		VKBUR_O = vKBUR_O;
	}
	public String getVKBUR_N() {
		return VKBUR_N;
	}
	public void setVKBUR_N(String vKBUR_N) {
		VKBUR_N = vKBUR_N;
	}
	public String getVKGRP_O() {
		return VKGRP_O;
	}
	public void setVKGRP_O(String vKGRP_O) {
		VKGRP_O = vKGRP_O;
	}
	public String getVKGRP_N() {
		return VKGRP_N;
	}
	public void setVKGRP_N(String vKGRP_N) {
		VKGRP_N = vKGRP_N;
	}
	public String getKUNAG_O() {
		return KUNAG_O;
	}
	public void setKUNAG_O(String kUNAG_O) {
		KUNAG_O = kUNAG_O;
	}
	public String getKUNAG_N() {
		return KUNAG_N;
	}
	public void setKUNAG_N(String kUNAG_N) {
		KUNAG_N = kUNAG_N;
	}
	public String getKUNWE_O() {
		return KUNWE_O;
	}
	public void setKUNWE_O(String kUNWE_O) {
		KUNWE_O = kUNWE_O;
	}
	public String getKUNWE_N() {
		return KUNWE_N;
	}
	public void setKUNWE_N(String kUNWE_N) {
		KUNWE_N = kUNWE_N;
	}
	public String getKUNRG_O() {
		return KUNRG_O;
	}
	public void setKUNRG_O(String kUNRG_O) {
		KUNRG_O = kUNRG_O;
	}
	public String getKUNRG_N() {
		return KUNRG_N;
	}
	public void setKUNRG_N(String kUNRG_N) {
		KUNRG_N = kUNRG_N;
	}
	public String getBSTKD_E() {
		return BSTKD_E;
	}
	public void setBSTKD_E(String bSTKD_E) {
		BSTKD_E = bSTKD_E;
	}
	public String getOperType() {
		return OperType;
	}
	public void setOperType(String operType) {
		OperType = operType;
	}

}
