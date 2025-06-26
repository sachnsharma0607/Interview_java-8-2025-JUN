package com.java8.sum;

import java.util.Arrays;

public class SungofDigitwithStringExample {
public static void main(String[] args) {
	String str="Item1 10 Item2 25 Item3 30 Item4 45";
	Integer sum = Arrays.stream(str.split("\\s+"))
		    .filter((s) -> s.matches("\\d+"))
		    .mapToInt(Integer::valueOf)
		    .sum();
	System.out.println(sum);
}
}
