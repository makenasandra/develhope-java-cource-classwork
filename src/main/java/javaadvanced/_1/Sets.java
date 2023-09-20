package javaadvanced._1;
/**
 * A set is an unordered collection of unique elements, meaning it cannot contain duplicate values
 * Here's a brief overview of some commonly used set implementations in Java:
 *
 * HashSet: It stores elements in a hash table, using the hash code of the objects. It offers constant-time performance for basic operations (add, remove, contains) on average. However, it does not guarantee any specific order of elements.
 * TreeSet: It maintains elements in sorted order, either according to their natural ordering or using a Comparator provided during set creation. It offers logarithmic time complexity for basic operations but sacrifices constant-time performance for sorted access.
 * LinkedHashSet: It combines the features of both HashSet and LinkedList, providing insertion-ordered iteration. It maintains a doubly-linked list alongside the hash table, preserving the order of insertion. The performance is slightly slower than HashSet but faster than TreeSet. To work with sets in Java, you first need to import the appropriate class from the Java Collections Framework. Here's an example demonstrating the usage of HashSet:
 */

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
    }

    private static void exerciseOne(){
        System.out.println("\nExercise 1: ");
        Set <Integer> ourSet = new HashSet<>();

        ourSet.add(1);
        ourSet.add(1);
        ourSet.add(5);
        ourSet.add(2);
        ourSet.add(1);

        System.out.println(ourSet);
        ourSet.remove(1);
        System.out.println(ourSet);
    }
    private static void exerciseTwo(){
        System.out.println("\nExercise 2: ");
    }
    private static void exerciseThree(){
        System.out.println("\nExercise 3: ");
        Set<Integer> setA = Set.of(1,2,3,4,5,6,7,8,9,10);
        Set<Integer> setB = Set.of(5,6,7,8,9,10,11,12,13,14,15);
        Set<Integer> itemsInBothSets = new HashSet<>();

        for (Integer item:setA) {
            if(setB.contains(item)){
               itemsInBothSets.add(item);
            }
        }
        if(!itemsInBothSets.equals(Set.of(5,6,7,8,9,10))){
            System.out.println("3b. Incorrect number of items");
        } else{
            System.out.println("Good job girl!");
        }


    }
    private static void exerciseFour(){
        System.out.println("\nExercise 4: ");

        Set<Integer> numbers = Set.of(6,2,3,4,5,1,7,8,9,10);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer num:numbers) {
            if(num>max){ max =num;}
            if(num<min){ min =num;}
        }

        if(max!=10 || min !=1 ){
            System.out.println("3b. Incorrect max and min value" + max + min);
        } else{
            System.out.println("Good job girl!");
        }
    }
}
