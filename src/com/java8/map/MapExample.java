package com.java8.map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {
public static void main(String[] args) {
	System.out.println(Stream.of(3,5,6).map(n->n*2).collect(Collectors.toList()));
}
}
