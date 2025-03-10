import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("name", "Alice");
        hashMap.put("age", "25");
        hashMap.put("occupation", "Engineer");

        // Retrieving values using keys
        System.out.println("Name: " + hashMap.get("name"));
        System.out.println("Age: " + hashMap.get("age"));
        System.out.println("Occupation: " + hashMap.get("occupation"));

        // Updating a value
        hashMap.put("age", "26");
        System.out.println("Updated Age: " + hashMap.get("age"));

        // Checking if a key exists
        if (hashMap.containsKey("occupation")) {
            System.out.println("Occupation is present in the HashMap.");
        }

        // Removing a key-value pair
        hashMap.remove("occupation");
        System.out.println("HashMap after removing 'occupation': " + hashMap);

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}