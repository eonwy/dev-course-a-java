package com.grepp.library.c_collection.a_generic.domain;

public class Device {

    private String name;

    public Device(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " is on");
    }

    @Override
    public String toString() {
        return "Device{" +
            "name='" + name + '\'' +
            '}';
    }
}
