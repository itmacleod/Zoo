import java.util.LinkedList;

public class Location {
	
	//instance variables
	private String name;
	private LinkedList<String> animals = new LinkedList<>();
	
	/**
	 * non-default constructor that initializes the name of the newly instantiated location
	 * @param name name of the location
	 */
	public Location(String name) {
		this.name = name;
	}
	
	/**
	 * Setter method that sets the name of the current location
	 * @param name name to be set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * getter method that returns the name of the location
	 * @return name of the location
	 */
	public String getLocationName() {
		return this.name;
	}

}
