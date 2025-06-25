package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapTest01 {
public static void main(String[] args) {
	stringConverUppercas();
	System.out.println("-------------");
	findtheLeghtofGivenString();
}

public static void stringConverUppercas()
{
	List<String> list = Arrays.asList("geeks", "gfg", "g",
            "e", "e", "k", "s");

// Using Stream map(Function mapper) to
// convert the Strings in stream to
// UpperCase form
List<String> answer = list.stream().map(String::toUpperCase).
collect(Collectors.toList());

// displaying the new stream of UpperCase Strings
System.out.println(answer);
}


public static void findtheLeghtofGivenString()
{
	 System.out.println("The stream after applying "
             + "the function is : ");

// Creating a list of Strings
List<String> list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ",
                            "Computer", "Science", "gfg");

// Using Stream map(Function mapper) and
// displaying the length of each String
list.stream().map(str -> str.length()).forEach(System.out::println);
}
}
