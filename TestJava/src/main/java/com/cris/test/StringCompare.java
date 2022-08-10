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
public class StringCompare {
    
    
    
    public static void main(String[] args) {
        
        
        String[] strarr= new String[]{"IECODE","GROUPID"};
        List<String> list1 =Arrays.asList(strarr);
        
        
        List<String> list2 =Arrays.asList(new String("IECODE"),new String("GROUPID"));
        
        System.out.println(list1.containsAll(list2));
        
                
                
                
    }
}
