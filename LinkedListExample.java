import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("Dog");
        list.add("Cat");
        list.add("Rabbit");

        // Display the LinkedList
        System.out.println("LinkedList: " + list);

        // Get an element from the LinkedList
        String animal = list.get(1);
        System.out.println("Element at index 1: " + animal);

        // Remove an element from the LinkedList
        list.remove("Cat");
        System.out.println("LinkedList after removal: " + list);

        // Iterate through the LinkedList
        System.out.print("Iterating through LinkedList: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
    }
}
