package com.java8.count;

import java.util.stream.Stream;

public class Count {

    public static void main(String[] args) {
		System.out.println(Stream.of(0, 2, 4, 6,
                                       8, 10, 12).count());
	}

}

