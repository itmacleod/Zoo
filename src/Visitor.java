
public class Visitor {
	
	//instance variables
	
	private Location currentLocation;
	
	/**
	 * getter method that returns current location
	 * @return the visitor's current location
	 */
	public Location getLocation() {
		return this.currentLocation;
	}
	
	/**
	 * setter method that sets the visitors current location
	 * @param l current location to be set
	 */
	public void setCurrentLocation(Location l) {
		this.currentLocation = l;
	}

}
