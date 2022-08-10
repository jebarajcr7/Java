/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.design.builder;

/**
 *
 * @author Jebaraj
 */
public class TestBuilder {

    public static void main(String[] args) {
        
        // Creatonal Design Pattern
        //No need to pass all parameters in constructor
        //No need to remember the constructor parameter order
        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).getPhone();
    
        System.out.println(phone);
    
    }
}
