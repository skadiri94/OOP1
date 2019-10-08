package com.skpackage.problem.set2;

public class Person {
    private String name;

    public Person(String name){
        setName(name);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString() {return name; }
}
