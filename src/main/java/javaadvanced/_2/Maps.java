package javaadvanced._2;

import java.util.*;

/**
 *  A map is an object that stores key-value pairs, where each key is unique,
 *  and it allows efficient lookup, insertion, and deletion of elements based on the key.
 *  Some commonly used map implementations in Java:
 *
 * HashMap: It stores key-value pairs in a hash table, using the hash code of the keys.
 * It offers constant-time performance for basic operations (put, get, remove) on average.
 * However, it does not guarantee any specific order of elements.
 * TreeMap: It maintains key-value pairs in sorted order based on the natural ordering of the keys
 * or a custom Comparator provided during map creation.
 * It offers logarithmic time complexity for basic operations but sacrifices constant-time performance
 * for sorted access.
 * LinkedHashMap: It combines the features of both HashMap and LinkedList, providing predictable
 * iteration order (either insertion order or access order) alongside the hash table.
 * The performance is slightly slower than HashMap but faster than TreeMap.
 * ConcurrentHashMap: It is designed for concurrent access, allowing multiple threads to access and
 * modify the map simultaneously. It provides thread-safe operations with good scalability,
 * making it suitable for multi-threaded applications. To work with maps in Java,
 * you first need to import the appropriate class from the Java Collections Framework
 */
public class Maps {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    private static void exerciseOne(){
        System.out.println("\nExercise 1: ");
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Winter");
        myMap.put(2, "Summer");
        myMap.put(3, "Autumn");

        System.out.println(myMap);

        System.out.println(myMap.get(3));

        myMap.remove(2);

        System.out.println("New map: " + myMap);
    }

    private static void exerciseTwo(){
        System.out.println("\nExercise 2: ");

        Map<String, Double> menuCosts = new HashMap<>();

        menuCosts.put("Fries", 3.50);
        menuCosts.put("Pizza", 11.80);
        menuCosts.put("Burger", 8.50);

        String mostExpensiveItems = null;
        Double maxPrice = Double.MIN_VALUE;

        for (Map.Entry<String, Double> keyValue:menuCosts.entrySet()) {
            if(keyValue.getValue() > maxPrice){
                maxPrice = keyValue.getValue();
                mostExpensiveItems = keyValue.getKey();
            }
        }
        System.out.println("Most expensive item on the menu: " + mostExpensiveItems);
    }

    private static void exerciseThree(){
        System.out.println("\nExercise 3: ");

        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Orange", 3);
        fruitWeights.put("Apple", 2);
        fruitWeights.put("Watermelon", 10);
        fruitWeights.put("Pawpaw", 7);

        int totalFruitWeight = 0;

        for (Integer weight:fruitWeights.values()) {
            totalFruitWeight += weight;
        }

        System.out.println("Total weight of fruits: "+ totalFruitWeight);
    }
}
