/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Jebaraj
 */
public class StreamTest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 1, 2, 3, 3);

        //printing the stream
        list.stream().forEach(System.out::println);

        //map receives a function which is applied to the elements of this stream.
        list.stream().map(i -> i + 10).forEach(System.out::println);

        //filter receives a Predicate which is applied to the elements of this stream and returns results.
        list.stream().filter(i -> i < 3).forEach(System.out::println);

        //returns distinct values
        list.stream().distinct().forEach(System.out::println);

        //returns sorted values based on comparable 
        // sorted method also accepts comparator
        list.stream().sorted().forEach(System.out::println);
        
        
        //returns distinct values
        Integer sum= list.stream().reduce(0,(i,j)->i+j);
        
        System.out.println("Total sum using reduce"+sum);

        //other methods - min, max , toArray, toList, count,findAny, 
        System.out.println("is any lessthan 3 " + list.stream().anyMatch(i -> i < 3));
        System.out.println("is none lessthan 3 " + list.stream().noneMatch(i -> i < 3));
        System.out.println("is all lessthan 5 " + list.stream().allMatch(i -> i < 5));
        System.out.println("First element " + list.stream().findFirst());

        //skip - excludes everything before the index
        list.stream().skip(2).forEach(System.out::println);

        //limit - excludes everything after the index
        list.stream().limit(2).forEach(System.out::println);

        // Binary Operator extends BiFunction -> has method apply(T t,T t)
        System.out.println("Total sum " + list.stream().reduce(0, (c, e) -> c + e));
        // 0 - identity
        //(c,e)->c+e) - BinaryOperator

        //Using sum as method ref
        System.out.println("Total sum method ref " + list.stream().reduce(0, Integer::sum));
        System.out.println("Total sum method ref " + list.stream().reduce(0, StreamTest::sum));
// Collectors ->  toList, toSet, toMap
        Set<Integer> set = list.stream().collect(Collectors.toSet());

        //applies function and returns value in Double
         list.stream().mapToDouble(i -> i + 10).forEach(System.out::println);
        
    }

    static Integer sum(Integer i, Integer j) {
        System.out.println(" i= " + i + " j= " + j);
        return i + j;

        
    }
}
