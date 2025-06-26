package com.java8.reduce;

import java.util.stream.Stream;

public class Multipleusingreduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Stream.of(1,2,3,4,5,5,6).reduce(1, (subtotal,element)->subtotal*element));
	

	}

}
