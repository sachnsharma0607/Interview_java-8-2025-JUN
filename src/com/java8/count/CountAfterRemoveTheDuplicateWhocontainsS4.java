package com.java8.count;

import java.util.stream.Stream;

public class CountAfterRemoveTheDuplicateWhocontainsS4 {

	public static void main(String[] args) {
		System.out.println(Stream.of("GFG", "Geeks", "for", "Geeks",
	            "GeeksforGeeks", "GFG").distinct().filter(str->str.toLowerCase().contains("s")).count());
	}
	}