package com.java8.sorted;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateWithDisntictmtMeyhod {

	public static void main(String[] args) {
		System.out.println("Remove duplicate without using distinct keyword For integer");
		System.out.println(Stream.of(2,2,5,5,6,7,6).distinct().collect(Collectors.toSet()));
		System.out.println("Remove duplicate with out using distinct keyword for String");
		System.out.println(Stream.of("sachin","sachin","nitin").collect(Collectors.toSet()));
	}
	}
