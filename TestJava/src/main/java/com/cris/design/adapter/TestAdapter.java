/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.design.adapter;

/**
 *
 * @author Jebaraj
 */
public class TestAdapter {

    public static void main(String[] args) {
//Structural design pattern
// Using an adapter class to create object of Pen by adapting PilotPen
        Pen p1 = new PenAdapter();

        p1.write();

    }
}
