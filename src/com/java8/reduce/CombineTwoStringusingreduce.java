package com.java8.reduce;

import java.util.stream.Stream;

public class CombineTwoStringusingreduce {
public static void main(String[] args) {
	
    
    Stream.of("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks")
    .reduce((str1, str2) -> str1 + "-" + str2).ifPresent(System.out::println);

}
}
