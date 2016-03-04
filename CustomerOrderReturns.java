
public class CustomerOrderReturns {
	private Integer quantity;
	private String reason;
	private Integer product_product_ID;
	private Integer customerOrder_customerOrderID;
	
	public CustomerOrderReturns(Integer quantity, String reason,
			Integer product_product_ID, Integer customerOrder_customerOrderID) {
		this.quantity = quantity;
		this.reason = reason;
		this.product_product_ID = product_product_ID;
		this.customerOrder_customerOrderID = customerOrder_customerOrderID;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public String getReason() {
		return reason;
	}

	public Integer getProduct_product_ID() {
		return product_product_ID;
	}

	public Integer getCustomerOrder_customerOrderID() {
		return customerOrder_customerOrderID;
	}
	
}
