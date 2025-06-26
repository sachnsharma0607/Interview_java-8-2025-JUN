package com.java8.sorted;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {
public static void main(String[] args) {
	System.out.println("Remove duplicate By using distinct keyword For integer");
	System.out.println(Stream.of(2,2,5,5,6,7,6).distinct().collect(Collectors.toList()));
	System.out.println(Stream.of(2,2,5,5,6,7,6).distinct().collect(Collectors.toList()));
	System.out.println("Remove duplicate By using distinct keyword for String");
	System.out.println(Stream.of("sachin","sachin","nitin").distinct().collect(Collectors.toList()));
	System.out.println(Stream.of("sachin","sachin","nitin").collect(Collectors.toSet()));
}
}

