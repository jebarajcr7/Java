/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.design.factory;

/**
 *
 * @author Jebaraj
 */
public class FactoryTest {

    public static void main(String[] args) {
        OSFactory factory = new OSFactory();

        OS os = factory.getOS("Open");
        os.print();
    }
}
