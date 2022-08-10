/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.test;

import com.cris.dto.Customer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jebaraj
 */
public class MapFlatMapTest {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList();
        customers.add(new Customer("001", "jeba", Arrays.asList("12345", "67890")));
        customers.add(new Customer("001", "jeba", Arrays.asList("45321", "65412")));
        customers.add(new Customer("001", "jeba", Arrays.asList("78945", "32165")));

        //data transformation alone
        //one to one mapping
        //takes stream as param
        List<String> names = customers.stream().map(customer -> customer.getName())
                .collect(Collectors.toList());
        System.out.println(names);

        //if we use map for one to many 
        List<List<String>> phoneGroups = customers.stream().map(customer -> customer.getPhones())
                .collect(Collectors.toList());
        System.out.println(phoneGroups);

        //one to Many 
        // data tranformation and flattening
        //takes steam of stream as param
        // use this when mapper function produces multiple values for each input value
        List<String> phones = customers.stream().flatMap(customer -> customer.getPhones().stream())
                .collect(Collectors.toList());
        System.out.println(phones);

    }
}
