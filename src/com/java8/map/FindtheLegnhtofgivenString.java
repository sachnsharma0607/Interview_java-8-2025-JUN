package com.java8.map;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FindtheLegnhtofgivenString {
public static void main(String[] args) {
	System.out.println(Stream.of("sachin","kumar","sharma").map(String::length).collect(Collectors.toList()));
}
}
