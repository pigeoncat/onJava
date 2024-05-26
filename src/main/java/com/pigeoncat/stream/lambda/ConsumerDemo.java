package com.pigeoncat.stream.lambda;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author pigeoncat
 * @Date 2024/04/12  14:41
 * @TODO description
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("tom",12));
        students.add(new Student("jack",12));
        students.forEach(e -> e.name=e.name.toUpperCase());
        students.forEach(System.out::println);
    }
}
