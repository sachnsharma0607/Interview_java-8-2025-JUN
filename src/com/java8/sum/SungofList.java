package com.java8.sum;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SungofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Stream.of(2,3,4,5).collect(Collectors.summingInt(Integer::intValue)));
		System.out.println("-------------");
		System.out.println(Stream.of(2,3,4,5).collect(Collectors.summingInt(n->Integer.valueOf(n))));
			
	}

}
