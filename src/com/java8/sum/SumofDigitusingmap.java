package com.java8.sum;

import java.util.stream.Stream;

public class SumofDigitusingmap {
public static void main(String[] args) {
	System.out.println(Stream.of(1,2,3,4,5).mapToInt(Integer::intValue).sum());
}
}
