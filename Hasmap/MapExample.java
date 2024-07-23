import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> phoneDirectory = new HashMap<>();

        // Adding entries to the HashMap
        phoneDirectory.put("John", "123-456-7890");
        phoneDirectory.put("Jane", "987-654-3210");
        phoneDirectory.put("Bob", "555-666-7777");

        // Display the HashMap
        System.out.println("Phone Directory: " + phoneDirectory);

        // Accessing an element from the HashMap
        String johnNumber = phoneDirectory.get("John");
        System.out.println("John's number: " + johnNumber);

        // Removing an entry from the HashMap
        phoneDirectory.remove("Jane");
        System.out.println("Phone Directory after removal: " + phoneDirectory);

        // Checking if a key exists in the HashMap
        boolean hasBob = phoneDirectory.containsKey("Bob");
        System.out.println("Does Bob exist in the directory? " + hasBob);

        // Iterating through the HashMap
        System.out.println("Iterating through the phone directory:");
        for (Map.Entry<String, String> entry : phoneDirectory.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }
}
