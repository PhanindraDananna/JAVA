import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate element, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + hashSet);

        // Checking if an element exists
        if (hashSet.contains("Banana")) {
            System.out.println("Banana is present in the HashSet.");
        }

        // Removing an element
        hashSet.remove("Orange");
        System.out.println("HashSet after removing 'Orange': " + hashSet);

        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // Iterating over the HashSet
        System.out.println("Iterating over the HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Clearing the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);

        // Checking if the HashSet is empty
        if (hashSet.isEmpty()) {
            System.out.println("The HashSet is empty.");
        }
    }
}