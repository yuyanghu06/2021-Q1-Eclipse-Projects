public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by-default : a default construcctor
		//is provided if none are in the class!
		Ghost casper = new Ghost(); 
		Spider tarantula = new Spider(); 
//		Spider tarantula = new Spider("Tarantula");
		pumpkin pumpkin = new pumpkin(true, true); 
		tarantula.setName("tarantula"); //does not know how to print objet
		System.out.print(tarantula.getName());
		/*
		 * Spider s = new Spider("tarantula");
		 * 
		 * what constructor do you need so the
		 * code above is valid?
		 */
	}

}
//Only one public class can exist in a java file
//It should match the file name
class Ghost{
	//Properties - Attributes
	//private - always try to hide properties from outsiders
	public String name; 
	private double opacity;
	private double height; 
	private boolean isScary;
	public Ghost() { //zero argument constructor
		name = "Margaret Thatcher";
		opacity = 0.0;
		height = 5.0;
		isScary = true; 
		
	}
	//toString method allows printing of this object
	//it's called every time the object is passed through print.
	public String toString() {
		return name + ":" + isScary; 	
	}
}