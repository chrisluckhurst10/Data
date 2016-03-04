
public class Address {
	
	private String Line_1;
	private String Line_2;
	private String Town;
	private String County;
	private String Postcode;
	
	public Address (String Line_1,String Line_2, String Town, String County, String Postcode){
		this.Line_1 = Line_1;
		this.Line_2 = Line_2;
		this.Town = Town;
		this.County = County;
		this.Postcode = Postcode;
	}
	
	public String getLine_1(){
		return Line_1;
	}
	public String getLine_2(){
		return Line_2;
	}
	public String getTown(){
		return Town;
	}
	public String getCounty(){
		return County;
	}
	public String getPostcode(){
		return Postcode;
	}
}
