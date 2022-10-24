
public class pumpkin {
	private String color;
	private int length;
	private int width;
	private double height; 
	private boolean litUp; 
	private boolean isCarved;
	public pumpkin(){
		color = "orange";
		length = 1;
		width = 1;
		height = 0.5; 
	}
	public pumpkin(boolean paramLitUp, boolean paramIsCarved) {
		this();
		litUp = paramLitUp;
		isCarved = paramIsCarved; 
	}
	public String toString() {
		String result = "Color: " + color + "/n";
		result += "Size: " + length + " long " + width + " wide " + height + " tall" + "/n";
		result += "Lit Up: " + litUp;
		result += "Carved: " + isCarved; 
		return result; 
	}
	
}
