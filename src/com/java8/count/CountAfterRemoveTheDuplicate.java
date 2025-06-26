package com.java8.count;

import java.util.stream.Stream;

public class CountAfterRemoveTheDuplicate {
public static void main(String[] args) {
	System.out.println(Stream.of("GFG", "Geeks", "for", "Geeks",
            "GeeksforGeeks", "GFG").distinct().count());
}
}
