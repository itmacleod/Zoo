import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		boolean visitZoo = true;
		
		while(visitZoo) {
			Visitor visitor = new Visitor();
			Location location = new Location("Entrance");
			visitor.setCurrentLocation(location);
			System.out.println("Welcome to the zoo!");
			System.out.println("You are currently at the entrance...Where would you like to go? (Cats/Birds/Lizards) ");
			String goToLocation = stdin.next();
			if(goToLocation.equals("Cats")) {
				System.out.println("Great! Lets go see the tiger!");
				Location location2 = new Location("Big Cat Den");
				visitor.setCurrentLocation(location2);
				System.out.println(visitor.getLocation().getLocationName());
				visitZoo = false;
			}
		}
		
		

	}

}
