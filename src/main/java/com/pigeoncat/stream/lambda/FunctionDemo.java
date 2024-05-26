package com.pigeoncat.stream.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/**
 * @Author pigeoncat
 * @Date 2024/04/12  14:18
 * @TODO description
 */
public class FunctionDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("JAVA", "PYTHON", "GO", "C++");
        List<String> newList0 = map(list, e -> e.toLowerCase());
        newList0.forEach(System.out::println);
        List<Integer> newList1 = map(list, e -> e.length());
        newList1.forEach(System.out::println);
    }

    static <T,R> List<R> map(List<T> list, Function<T,R> fun){
        ArrayList<R> newList = new ArrayList<>();
        for (T e : list) {
            newList.add(fun.apply(e));
        }
        return newList;
    }
}
