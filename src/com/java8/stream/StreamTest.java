package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
public static void main(String[] args) {
	filterTest();
	System.out.println("----------------");
	sorted();
	System.err.println("-----");
	filterName();
	System.out.println("-----");
	filterTest01();
	System.out.println("U----");
	filterUpperString();
}

public static void filterTest()
{
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
	System.out.println(numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
}

public static void filterName()
{
	List<String> names = Arrays.asList("John", "Jane", "Jake", "Julie");
	List<String> filteredNames = names.stream()
	        .filter(name -> name.startsWith("Ja"))
	        .collect(Collectors.toList());
	System.out.println(filteredNames);
}

public static void filterTest01()
{
	List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
	List<Integer> filteredNumbers = numbers.stream()
	        .filter(n -> n > 20 && n < 50)
	        .collect(Collectors.toList());
	System.out.println(filteredNumbers); // Output: [30, 40
	
	

}


public static void filterUpperString()
{
	// Creating a stream of strings
    Stream<String> stream = Stream.of(
        "Geeks", "fOr", "GEEKSQUIZ", "Sachin","GeeksforGeeks");

    // Getting a stream consisting of the
    // elements having UpperCase Character
    // at custom index say be it '1'
    // using Stream filter(Predicate predicate)
    stream
        .filter(
            str -> Character.isUpperCase(str.charAt(1)))
        .forEach(System.out::println);
	
	

}


public static void sorted() {
	
	 List<Integer> list = Arrays.asList(101, 12, 3, 4, 5).stream().sorted().collect(Collectors.toList());;
System.out.println(list);
}
}
