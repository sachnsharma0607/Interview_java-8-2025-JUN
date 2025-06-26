package com.java8.sum;

import java.util.stream.Stream;

public class SumofDigitusingReducemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Stream.of(1,2,3,4,5).reduce(0, (a,b)->a+b));
	}

}
