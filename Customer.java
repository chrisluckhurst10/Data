
public class Customer {
	private Integer customer_ID;
	private String fullname;
	private String dateOfBirth;
	private String status;
	
	public Customer(Integer customer_ID, String fullname, String dateOfBirth,
			String status) {
		this.customer_ID = customer_ID;
		this.fullname = fullname;
		this.dateOfBirth = dateOfBirth;
		this.status = status;
	}
	
	public Integer getCustomer_ID() {
		return customer_ID;
	}
	public String getFullname() {
		return fullname;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getStatus() {
		return status;
	}
}
