package com.java8.map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConvertUpperCaseUsingJava8 {
public static void main(String[] args) {
	System.out.println(Stream.of("abc","efg","sad").map(str->str.toUpperCase()).collect(Collectors.toList()));
	
}
}
