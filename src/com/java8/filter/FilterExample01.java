package com.java8.filter;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample01 {
public static void main(String[] args) {

System.out.println(	Stream.of(25,10,5,4).filter(n->n%2==0).collect(Collectors.toList()));
	
}
}
