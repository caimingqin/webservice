package webservice;
public class Message implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String REQST;
	private String MSGTXT;
	
	public Message(){}

	public Message(String rEQST, String mSGTXT) {
		REQST = rEQST;
		MSGTXT = mSGTXT;
	}

	public String getREQST() {
		return REQST;
	}

	public String getMSGTXT() {
		return MSGTXT;
	}

}
