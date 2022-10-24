public class Spider {
	//properties / attributes
	//make them private
	//add 4 attributes
	private int spiderLegs; 
	private String color;
	private String spiderName;
	private String spiderPattern;
	private boolean isVenmous; 
	private int spiderLength; 
	private boolean isBig; 
	
	public String getName() {
		return spiderName; 
	}
	public int getLength() {
		return spiderLength;
	}
	public int getLegs() {
		return spiderLegs; 
	}
	//setters - allow for change of instsance variables
	public void setName(String name) {
		spiderName = name; 
	}
	public void setLength(int length) {
		spiderLength = length; 
	}
	public void setLegs(int legs) {
		spiderLegs = legs; 
	}
	//public void setName(String spiderName)(){ //does not work as two variables have the same name
	//this.spiderName = spiderName; //talking to the object, this is talking to the object
	//}
	public Spider() {
		this.spiderName = "Spider"; 
		this.spiderLength = 6;
		this.spiderLegs = 6; 
	}
	public Spider(String name, String pattern, boolean venmous, int length) {
		this(); 
		this.spiderName = name; 
		this.spiderPattern = pattern;
		this.isVenmous = venmous; 
		this.spiderLength = length; 
		if(spiderLength > 10) {
			isBig = true; 
		}
	}
	
	//add a default constructor
	public String toString() {
		return "This Spider has " + spiderLegs + " legs, and is " + spiderLength + " inches long." + " It is called a " + spiderName + "."; 
	}
	//add a toString method to allow for printing of Spider objects
}
