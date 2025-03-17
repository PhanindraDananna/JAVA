import java.util.ArrayList;
import java.util.List;

public class MemoryManagementExample {

    public static void main(String[] args) {
        // Display initial memory usage
        displayMemoryUsage("Initial Memory Usage");

        // Create a list to hold objects
        List<Object> objectList = new ArrayList<>();

        // Allocate memory by creating objects
        for (int i = 0; i < 100000; i++) {
            objectList.add(new Object());
        }

        // Display memory usage after object creation
        displayMemoryUsage("Memory Usage After Object Creation");

        // Clear the list to make objects eligible for garbage collection
        objectList.clear();

        // Suggest JVM to perform garbage collection
        System.gc();

        // Display memory usage after garbage collection
        displayMemoryUsage("Memory Usage After Garbage Collection");
    }

    // Helper method to display memory usage
    public static void displayMemoryUsage(String message) {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory(); // Total allocated memory
        long freeMemory = runtime.freeMemory();  // Free memory in the JVM
        long usedMemory = totalMemory - freeMemory; // Used memory

        System.out.println(message + ":");
        System.out.println("Total Memory: " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + " MB");
        System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + " MB");
        System.out.println();
    }
}