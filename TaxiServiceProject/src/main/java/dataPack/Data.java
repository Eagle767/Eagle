package dataPack;

public class Data {
	
	private String startstation,endstation,customerID;
	
	private int intertime;
	
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getStartstation() {
		return startstation;
	}

	public void setStartstation(String startstation) {
		this.startstation = startstation;
	}

	public String getEndstation() {
		return endstation;
	}

	public void setEndstation(String endstation) {
		this.endstation = endstation;
	}

	public int getIntertime() {
		return intertime;
	}

	public void setIntertime(int intertime) {
		this.intertime = intertime;
	}

}
