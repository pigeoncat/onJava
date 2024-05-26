package com.pigeoncat.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author pigeoncat
 * @Date 2024/04/12  10:32
 * @TODO description
 */
public class ExtendsAndSuper {
    static void  genericExtends(List<? extends Number> list){list.forEach(System.out::println);}
    static void  genericSuper(List<? super Number> list){list.forEach(System.out::println);}
    public static void main(String[] args) {
//        genericExtends(new ArrayList<Object>());
        genericExtends(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        System.out.println("****************************************");
//        genericSuper(new ArrayList<Integer>());
        genericSuper(new ArrayList<Object>(Arrays.asList(1,2,3)));

    }
}

