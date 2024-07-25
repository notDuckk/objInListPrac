package org.example;

public class Animal {
    String name;
    Boolean yayNay;

    public Animal(String name, Boolean yayNay){
        this.name = name;
        this.yayNay = yayNay;
    }

    public String getName(String name) {
        return this.name = name;
    }

    public Boolean getYayNay(Boolean yayNay) {
        return this.yayNay = yayNay;
    }

    @Override
    public String toString() {
        return getName(name) + " is a dog = " + getYayNay(yayNay);
    }
}
