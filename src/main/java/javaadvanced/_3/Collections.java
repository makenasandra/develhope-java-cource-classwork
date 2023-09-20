package javaadvanced._3;

/**
 * Here are some key points about the Collection interface in Java:
 *
 * Hierarchy: The Collection interface is a part of the broader Java Collections Framework, which includes interfaces such as List, Set, Queue, and Map. These interfaces extend or implement the Collection interface.
 * Basic Operations: The Collection interface defines the core operations to work with collections, including adding elements, removing elements, checking if an element exists, determining the size of the collection, and iterating over the elements.
 * No Direct Implementation: The Collection interface itself does not have any concrete implementation classes. Instead, it serves as a contract that other classes, such as ArrayList, LinkedList, HashSet, and TreeSet, implement to provide collection-specific behavior.
 * Iterable Interface: The Collection interface extends the Iterable interface, which means that all classes implementing the Collection interface can be iterated using the enhanced for loop or by using iterators.
 * Generics: The Collection interface supports the use of generics to specify the type of objects stored in the collection. This allows for compile-time type safety and avoids the need for explicit type casting.
 * Ordering: The Collection interface does not enforce any particular order on its elements. The order of elements can be defined by specific implementations, such as List or SortedSet, but it is not a requirement for all collections. To work with collections in Java, you can create instances of collection classes that implement the Collection interface.
 */

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
    }

    private static void exerciseOne() {
        System.out.println("\nExercise 1: ");

        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        Set<String> listSet = new HashSet<>();
        listSet.addAll(list);
        list = new ArrayList<>(listSet);

        System.out.println("New list" + list + " List size: " + list.size());
    }

    private static void exerciseTwo() {
        System.out.println("\nExercise 2: ");
        List<String> list = Arrays.asList("apple", "banana", "pawpaw", "watermelon", "pixie", "apple");
        Set<String> set = Set.of("apple", "banana");

        System.out.println("Set 1:" + toSet(list));
        System.out.println("Set 2:" + toSet(set));
    }

    private static Set<String> toSet(Collection collection){
        Set<String> newSet = new HashSet<>(collection);
        return newSet;
    }

    private static void exerciseThree() {
        System.out.println("\nExercise 3: ");

        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split( " ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word:words) {
           if(wordCount.containsKey(word)){
               wordCount.replace(word, wordCount.get(word)+1);
           } else {
               wordCount.put(word, 1);
           }
        }

        System.out.println("Word Count: " + wordCount);
    }

}
