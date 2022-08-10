/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.test;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jebaraj
 */
public class MethodRefTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jeba", "Cris");

        //Method ref - Passing method as an implemenation to functional interface
        
        list.forEach(System.out::println);
        String s = "Jeba";
        MyPrinter printer = new MyPrinter();
        //Method ref -passing a static method as param
        printer.print(s, StringParser::convert);
        // above line is equivalent to below block
        printer.print(s, new Parser() {
            @Override
            public String parse(String s) {
                return StringParser.convert(s);
            }

        });
        //Method ref along with lambda
        list.forEach(str -> printer.print(str, StringParser::convert));
    }
}

interface Parser {

    public String parse(String s);

}

class StringParser {

    public static String convert(String s) {
        return s.toLowerCase();
    }

}

class MyPrinter {

    public void print(String s, Parser p) {

        s = p.parse(s);
        System.out.println(s);
    }
}
