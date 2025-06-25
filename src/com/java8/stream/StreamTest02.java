package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
public static void main(String[] args) {
	compmareString01	();
	System.out.println("-----------");
	mFilter();
}

public static void mFilter()
{	
	List<Integer> list
    = Arrays.asList(0, 2, 4, 6, 8, 10);

// Using peek without any terminal
// //operation does nothing
list.stream().peek(System.out::println).forEach(x -> {});
}

public static void mPeek()
{
	Stream.of("apple", "banana", "cherry", "date", "elderberry")
    .peek(s -> System.out.println("Before filter: " + s))
    .filter(s -> s.length() > 5)
    .peek(s -> System.out.println("After filter: " + s))
    .forEach(System.out::println);
}

public static void duplicate()
{
	System.out.println(Arrays.asList(1,1,1222,4,5,6,67,77,77).stream().distinct().collect(Collectors.toList()));
	System.out.println(Arrays.asList(1,1,122,4,5,6,67,77,77).stream().distinct().max(Comparator.naturalOrder()).get());
}

public static void compmareString()
{
	// Creating a list of Strings
    List<String> list = Arrays.asList("G", "E", "E", "K",
                                      "g", "e", "e", "k");

    // using Stream.max() method with Comparator
    // Here, the character with maximum ASCII value
    // is stored in variable MAX
//    String MAX = list.stream().max(Comparator.
//                   comparing(String::valueOf)).get();

    String MAX = list.stream().max(Comparator.naturalOrder()).get();

    // Displaying the maximum element in
    // the stream according to provided Comparator
    System.out.println("Maximum element in the "
                       + "stream is : " + MAX);
}



public static void compmareString01()
{
	// Creating a list of Strings
    List<String> list = Arrays.asList("Geeta", "Eila", "Elisha", "Kavita",
                                   "Ankita"   );

    // using Stream.max() method with Comparator
    // Here, the character with maximum ASCII value
    // is stored in variable MAX
//    String MAX = list.stream().max(Comparator.
//                   comparing(String::valueOf)).get();

    String MAX = list.stream().max(Comparator.naturalOrder()).get();

    // Displaying the maximum element in
    // the stream according to provided Comparator
    System.out.println("Maximum element in the "
                       + "stream is : " + MAX);
}
}

