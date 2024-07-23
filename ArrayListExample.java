import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Display the ArrayList
        System.out.println("ArrayList: " + list);

        // Get an element from the ArrayList
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Remove an element from the ArrayList
        list.remove("Banana");
        System.out.println("ArrayList after removal: " + list);

        // Iterate through the ArrayList
        System.out.print("Iterating through ArrayList: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
    }
}
