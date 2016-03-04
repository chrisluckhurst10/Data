
public class CustomerorderLines {
	
	private Integer quantity;
	private Integer customerOrder_CustomerOrderID;
	private Integer product_product_ID;
	
	public CustomerorderLines(Integer quantity,
			Integer customerOrder_CustomerOrderID, Integer product_product_ID) {
		this.quantity = quantity;
		this.customerOrder_CustomerOrderID = customerOrder_CustomerOrderID;
		this.product_product_ID = product_product_ID;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getCustomerOrder_CustomerOrderID() {
		return customerOrder_CustomerOrderID;
	}

	public Integer getProduct_product_ID() {
		return product_product_ID;
	}
}
