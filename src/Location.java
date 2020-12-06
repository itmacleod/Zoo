import java.util.LinkedList;

public class Location {
	
	//instance variables
	private String name;
	private LinkedList<String> animals = new LinkedList<>();
	
	/**
	 * non-default constructor that only takes a name
	 * @param name name of the location
	 */
	public Location(String name) {
		this.name = name;
	}
	
	/**
	 * non-default constructor that initializes the name of the newly instantiated location, as well as adds the animals in that exhibit to the animals linkedlist
	 * @param name name of the location
	 * @param animal1 name of animal1
	 * @param animal2 name of animal2
	 * @param animal3 name of animal3
	 */
	public Location(String name, String animal1, String animal2, String animal3) {
		this.name = name;
		this.animals.add(animal1);
		this.animals.add(animal2);
		this.animals.add(animal3);
		
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
	
	/**
	 * getter method that returns the animals linkedlist
	 * @return animals linkedlist
	 */
	public LinkedList<String> getAnimals(){
		return this.animals;
	}

}
