package com.java8.count;

import java.util.stream.Stream;

public class CountTheTotalNumberofStringInaStream {
public static void main(String[] args) {
	System.out.println(Stream.of("sachin","nitin","neetu").count());
}
}
