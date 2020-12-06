import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		boolean visitZoo = true;
		
		System.out.println("Welcome to the zoo!");
		
		while(visitZoo) {
			Visitor visitor = new Visitor();
			Location location = new Location("Entrance");
			visitor.setCurrentLocation(location);
			System.out.println("You are currently at the entrance...Where would you like to go? (Cats/Birds/Lizards) ");
			String goToLocation = stdin.next();
			//visiting the cats
			if(goToLocation.equalsIgnoreCase("Cats")) {
				System.out.println("Great! Lets go see the tiger!");
				Location location2 = new Location("Big Cat Den", "tiger", "lion", "cheetah");
				visitor.setCurrentLocation(location2);
				System.out.println("The " + location2.getLocationName() + " exhibit has the following animals");
				for(String animal : location2.getAnimals()) {
					System.out.println("-" + animal);
				}
				System.out.println("Which would you like to visit? Type -1 to leave exhibit and go back to the entrance");
				
				
				visitZoo = false;
			}else if(goToLocation.equalsIgnoreCase("birds")) {
				System.out.println("Great! Lets go see the birds!");
				Location location3 = new Location("Aviary", "Penguin", "Parrot", "Flamingo");
				visitor.setCurrentLocation(location3);
				System.out.println("The " + location3.getLocationName() + " exhibit has the following animals");
				for(String animal : location3.getAnimals()) {
					System.out.println("-" + animal);
				}
				System.out.println("Which would you like to visit? Type -1 to leave exhibit and go back to the entrance");
				
				visitZoo = false;
			}else if(goToLocation.equalsIgnoreCase("lizards")) {
				System.out.println("Great! Lets go see the lizards");
				Location location4 = new Location("The Lizard Pit", "Komodo Dragon", "Gecko", "Salamander");
				visitor.setCurrentLocation(location4);
				System.out.println("The " + location4.getLocationName() + " exhibit has the following animals");
				for(String animal : location4.getAnimals()) {
					System.out.println("-" + animal);
				}
				System.out.println("Which would you like to visit? Type -1 to leave exhibit and go back to the entrance");
				
				visitZoo = false;
			}else {
				System.out.println("Sorry, that is not a location");
			}
		}
		
		

	}

}
