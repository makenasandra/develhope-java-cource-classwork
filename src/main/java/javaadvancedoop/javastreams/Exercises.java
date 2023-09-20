package javaadvancedoop.javastreams;

/**
 * Java Streams is a powerful feature introduced in Java 8 that provides a streamlined
 * and functional approach to process collections of data. Streams enable developers to
 * write concise and expressive code by leveraging functional programming concepts such
 * as lambda expressions and method references. At its core, a stream represents a sequence
 * of elements that can be processed in parallel or sequentially. It abstracts away the
 * complexities of iteration and provides a declarative way to perform operations on data,
 * such as filtering, mapping, reducing, and sorting. One of the key benefits of using streams
 * is that they promote a more functional style of programming, where data is transformed and
 * processed without modifying the original collection. This immutability improves code readability,
 * maintainability, and testability. Streams operate on various data sources, including collections,
 * arrays, I/O channels, and generators. They can be created from these sources using the stream()
 * or parallelStream() methods provided by the Collection interface, or by using the static factory
 * methods in the Stream class. Once a stream is created, it can be chained with multiple operations
 * to perform complex data processing. These operations are divided into two categories: intermediate
 * and terminal operations. Intermediate operations, such as filter(), map(), and sorted(), transform
 * the stream and return a new stream. They can be composed together to form a processing pipeline.
 * Terminal operations, such as forEach(), collect(), and reduce(), consume the stream and produce a
 * result or a side effect. Streams also support lazy evaluation, meaning that intermediate operations
 * are only executed when a terminal operation is invoked. This allows for efficient processing of large
 * datasets, as only the necessary elements are computed and processed. Additionally, streams can take
 * advantage of parallel processing to enhance performance on multi-core systems. By simply invoking the
 * parallel() method on a stream, the underlying operations are automatically executed concurrently,
 * exploiting the available processing power. Java Streams provide an elegant and concise way to perform
 * data manipulation and processing. By embracing functional programming principles, they make code more
 * readable, maintainable, and efficient. Whether you're working with simple collections or large datasets,
 * Java Streams offer a powerful toolset to handle data processing tasks in a modern and expressive way.
 */

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {
    public static void main(String[] args) {

        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exercise4();
    }

    private static final List<Integer> ourNumbers = IntStream.range(1, 10).boxed().toList();
    private static void exerciseOne() {
        System.out.println("\nExercise 1: ");

        //filter and print out even numbers from number List called ourNumbers
        ourNumbers.stream().filter( number -> number%2 == 0).forEach(number -> System.out.println("Even numbers: " + number));
    }

    private static void exerciseTwo() {
        System.out.println("\nExercise 2: ");

        Set<Integer> oddNumbers = ourNumbers.stream().filter(oddNumber -> oddNumber%2 !=0)
                .collect(Collectors.toSet());

        System.out.println("Set of odd numbers: " + oddNumbers);
    }


    private static void exerciseThree() {
        System.out.println("\nExercise 3: ");

        List<String> names = List.of("Alice", "Bob", "Charlie");

        System.out.println(names.stream().map(name -> name.toUpperCase()).collect(Collectors.toSet()));
    }

    private static void exercise4() {
        System.out.println("\nExercise 4: ");

        System.out.println(ourNumbers.stream().filter(evenNumber -> evenNumber%2 == 0)
                .map(evenNumber -> evenNumber*2).collect(Collectors.toSet()));
    }
}
