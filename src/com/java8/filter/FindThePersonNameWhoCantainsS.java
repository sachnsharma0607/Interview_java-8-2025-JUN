package com.java8.filter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindThePersonNameWhoCantainsS {
public static void main(String[] args) {
	System.out.println(Stream.of("Sachin","nitin","Sandeep").filter(str->str.toLowerCase().contains("s")).collect(Collectors.toList()));
}
}
