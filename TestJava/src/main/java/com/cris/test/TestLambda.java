/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.cris.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Jebaraj
 */
public class TestLambda {

     public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 1, 2, 3);

        // foreach with regular class
        System.out.println("Regular class impl Consumer interface");
        Consumer<Integer> con = new ConsumerImpl();

        list.forEach(con);

        // foreach with anonymous class of Consumer iface
        System.out.println("Anonymous class");
        Consumer<Integer> anon = new Consumer<Integer>() {

            public void accept(Integer i) {

                System.out.println(i);
            }

        };

        list.forEach(anon);

        //detailed lambda
        System.out.println("detailed lambda");
        Consumer<Integer> lambdaCon = (Integer i) -> {
            System.out.println(i);
        };
        list.forEach(lambdaCon);

        //internal loop lambda shorter 
        //faster than external for loops
        System.out.println("shorter lambda");
        list.forEach(i -> System.out.println(i));
    }

}

class ConsumerImpl implements Consumer {

    @Override
    public void accept(Object t) {

        System.out.println(t);
    }

}
