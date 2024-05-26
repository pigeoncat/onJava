package com.pigeoncat.stream.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author pigeoncat
 * @Date 2024/04/12  13:43
 * @TODO descriptionc
 */
public class PredicateDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("tom",12));
        students.add(new Student("jack",23));
        students.add(new Student("mary",32));
        List<Student> list = Util.filter(students, e -> e.age < 25 );
        list.forEach(System.out::println);
    }
}

class Util{
    static <E> List<E> filter(List<E> list, Predicate<E> pred){
        ArrayList<E> newList = new ArrayList<>();
        for (E e : list) {
            if ( pred.test(e)) {
                newList.add(e);
            }
        }
        return newList;
    }
}

class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}