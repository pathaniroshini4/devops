import java.util.Random;
import java.util.Scanner;

public class TravelDestinationGenerator {

    public static void main(String[] args) {
        // Array of travel destinations
        String[] destinations = {
            "Paris, France",
            "Tokyo, Japan",
            "New York City, USA",
            "Sydney, Australia",
            "Rome, Italy",
            "Cape Town, South Africa",
            "Barcelona, Spain",
            "Rio de Janeiro, Brazil",
            "Dubai, UAE",
            "Bangkok, Thailand"
        };

        // Create a random number generator
        Random random = new Random();
        
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        do {
            // Generate a random index to pick a destination
            int randomIndex = random.nextInt(destinations.length);
            String randomDestination = destinations[randomIndex];

            // Display the chosen destination
            System.out.println("Your travel destination is: " + randomDestination);

            // Ask if the user wants to generate another destination
            System.out.print("Would you like to choose another destination? (yes/no): ");
            continueChoice = scanner.nextLine().toLowerCase();
            
        } while (continueChoice.equals("yes"));

        System.out.println("Happy travels!");
        scanner.close();
    }
}
