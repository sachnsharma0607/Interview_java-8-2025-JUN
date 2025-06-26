package com.java8.filter;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindfiveLetterName {
public static void main(String[] args) {
	
	System.out.println(Stream.of("Sachin","Nitin","Neetu").filter(str->str.length()==5).collect(Collectors.toList()));
}
}
