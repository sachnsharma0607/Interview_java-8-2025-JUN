package com.java8.reduce;

import java.util.stream.Stream;

public class SumofDigitusingreduce {
public static void main(String[] args) {
	
	System.out.println(Stream.of(1,2,3,4,5,5,6).reduce(0, (subtotal,element)->subtotal+element));
}
}
