package com.pigeoncat.stream.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @Author pigeoncat
 * @Date 2024/04/12  15:55
 * @TODO description
 */
public class StreamDemo {
    public static void main(String[] args) {
        Arrays.asList("timi","tom","jack","mary","steam","tom")
                .stream()
                .filter(s->s.length()<5)
                .peek(System.err::println)
                .map(String::toUpperCase)
                .skip(1)
                .distinct()
                .sorted((a,b)->a.length()-b.length())
                .limit(2)
                .collect(Collectors.toList())
                .forEach(System.out::println);








    }
}
