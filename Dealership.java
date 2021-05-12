import java.util.*;

public class Dealership {
    
    public static void main(String[] args) {

        /*
        You are a car dealer. Create a hash map of vehicles.
            The model is the Key, the make is the Value.
            Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
            (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
        */

        // Create new HashMap to hold dealership info.
        HashMap<String, List<String>> dealership = new HashMap<>();

        // Add Subaru, Honda, and Ford with their models to the dealership HashMap
        dealership.put("Subaru", new ArrayList<String>(List.of("Impreza", "Outback", "Forrestor")));
        dealership.put("Honda", new ArrayList<String>(List.of("Civic", "Accord", "Pilot")));
        dealership.put("Ford", new ArrayList<String>(List.of("Taurus", "Explorer", "Mustang")));

        // // Tests to ensure the models are correctly being added to each brand.
        // System.out.println(dealership.get("Subaru"));
        // System.out.println(dealership.get("Honda"));
        // System.out.println(dealership.get("Ford"));

        // Create program to let customer know if we have the car brand.
        // If we have the brand, let them know the models we have for that brand.
        Scanner userInput = new Scanner(System.in);

        System.out.println("What brand of car are you looking for? ");
        String carBrand = userInput.next();

        if (dealership.containsKey(carBrand)) {
            // Confirm to the customer we have that brand in stock
            System.out.printf("We have the following %s models:", carBrand);
            // Display the available models to the customer.
            for (String model : dealership.get(carBrand)) {
                System.out.printf("\n%s", model);
            }

        } else {
            System.out.printf("We don't have any %s cars, sorry!", carBrand);
        }

    }
}
