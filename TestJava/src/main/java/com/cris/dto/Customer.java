/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.dto;

import java.util.List;

/**
 *
 * @author Jebaraj
 */
public class Customer {
    private String id;
    private String name;
    private List<String> phones;

    public Customer(String id, String name, List<String> phones) {
        this.id = id;
        this.name = name;
        this.phones = phones;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the phones
     */
    public List<String> getPhones() {
        return phones;
    }

    /**
     * @param phones the phones to set
     */
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
    
    
    
}
