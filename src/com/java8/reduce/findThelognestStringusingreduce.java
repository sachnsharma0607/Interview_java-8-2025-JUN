package com.java8.reduce;

import java.util.stream.Stream;

public class findThelognestStringusingreduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Stream.of("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks")
         .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).ifPresent(System.out::println);

      

	}

}
