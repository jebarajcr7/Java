/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.design.builder;

/**
 *
 * @author Jebaraj
 */
public class PhoneBuilder {

    private String os;
    private int ram;
    private String processor;
    private int storage;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;

    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;

    }

    public PhoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;

    }

    public Phone getPhone() {
        return new Phone(os, ram, processor, storage);
    }
}
