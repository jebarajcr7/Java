/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cris.design.builder;

/**
 *
 * @author Jebaraj
 */
public class Phone {
    private String os;
    private int ram;
    private String processor;
    private int storage;

    public Phone(String os, int ram, String processor, int storage) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" + "os=" + os + ", ram=" + ram + ", processor=" + processor + ", storage=" + storage + '}';
    }

    /**
     * @return the os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os the os to set
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the processor
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * @param processor the processor to set
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * @return the storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }
    
    
    
}
