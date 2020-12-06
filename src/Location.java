import java.util.LinkedList;

public class Location {
	
	private String name;
	private LinkedList<String> animals = new LinkedList<>();
	
	public Location(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocationName() {
		return this.name;
	}

}
