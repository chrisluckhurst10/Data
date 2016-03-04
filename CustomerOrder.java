
public class CustomerOrder {
	private Integer customerOrderID;
	private String datePlaced;
	private String dateDelivered;
	private String orderStatus;
	private String customer_customer_ID;
	private String address_postcode;
	private String address_line_1;
	
	public CustomerOrder(Integer customerOrderID, String datePlaced,
			String dateDelivered, String orderStatus,
			String customer_customer_ID, String address_postcode,
			String address_line_1) {
		this.customerOrderID = customerOrderID;
		this.datePlaced = datePlaced;
		this.dateDelivered = dateDelivered;
		this.orderStatus = orderStatus;
		this.customer_customer_ID = customer_customer_ID;
		this.address_postcode = address_postcode;
		this.address_line_1 = address_line_1;
	}
	
	public Integer getCustomerOrderID() {
		return customerOrderID;
	}
	public String getDatePlaced() {
		return datePlaced;
	}
	public String getDateDelivered() {
		return dateDelivered;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public String getCustomer_customer_ID() {
		return customer_customer_ID;
	}
	public String getAddress_postcode() {
		return address_postcode;
	}
	public String getAddress_line_1() {
		return address_line_1;
	}
	
	
}
