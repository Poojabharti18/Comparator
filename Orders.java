package ComparatorEx;

public class Orders {
	private int orderId;
	private String oName;
	private int nooforders;
	public Orders()
	{
		
	}
	public Orders(int orderId, String oName, int nooforders) {
		super();
		this.orderId = orderId;
		this.oName = oName;
		this.nooforders = nooforders;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public int getNooforders() {
		return nooforders;
	}
	public void setNooforders(int nooforders) {
		this.nooforders = nooforders;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", oName=" + oName + ", nooforders=" + nooforders + "]";
	}
	
	

}
