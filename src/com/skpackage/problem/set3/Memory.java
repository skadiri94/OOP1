package com.skpackage.problem.set3;

public class Memory {

    private String type;
    private int size;

    public Memory(){

        this("Unknown Type",0);

    }

    public Memory(int size){

       // setSize(size);
        //setType("Unknown Type");

        this("Unknown",size);

    }

    public Memory(String type, int size){

        setType(type);
        setSize(size);

    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public String toString(){

        return String.format("Type: %s\nSize: %d",getType(),getSize());
    }
}
