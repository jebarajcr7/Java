/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.design.factory;

/**
 *
 * @author Jebaraj
 */
public class OSFactory {

    public  OS getOS(String str) {
        if (str.equals("Open")) {
            return new Android();
        } else {
            return new IOS();
        }
    }

}
