
public class Box {
	
	private Integer Box_ID;
	private String Dimensions;
	
	public Box(Integer Box_ID, String Dimensions){
		this.Box_ID = Box_ID;
		this.Dimensions = Dimensions;
	}
	
	public Integer getBox_ID(){
		return Box_ID;
	}
	
	public String getDimensions(){
		return Dimensions;
	}
}
