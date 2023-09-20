package livecoding.classcoding;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
// Create a HashMap
        Map<String, Integer> map = new HashMap<>();
// Add key-value pairs to the map
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 8);
// Get the value associated with a key
        int appleCount = map.get("Apple");
        System.out.println("Apple count: " + appleCount); // Output: 10
// Check if a key exists
        boolean containsKey = map.containsKey("Banana");
        System.out.println("Contains Banana? " + containsKey); // Output: true
// Remove a key-value pair
        map.remove("Orange");
// Iterate over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String fruit = entry.getKey();
            int count = entry.getValue();
            System.out.println(fruit + ": " + count);
        }

        for (Integer key: map.values()
             ) {
            System.out.println(key);
        }
    }
}
