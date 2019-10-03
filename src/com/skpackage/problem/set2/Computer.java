package com.skpackage.problem.set2;

public class Computer {

    private String brand;
    private String type;
    private float size;
    private float value;


    public Computer() {
        this("Empty", "Empty", 0, 0);
    }

    public Computer(String brand,String type,float size,float value){

        setBrand(brand);
        setType(type);
        setSize(size);
        setValue(value);
    }

    public void setBrand(String brand){this.brand = brand;}

    public void setType(String type){this.type = type;}

    public void setSize(float size){ this.size = size;}

    public void setValue(float value){this.value = value;}

    public String getBrand(){return brand;}

    public String getType(){return type;}

    public float getSize(){return size;}

    public float getValue(){return value;}


    public String toString(){

        return String.format("%-25s%-25s%-25s%-25s\n\n%-25s%-25s%15.2f%15.2f","Brand","Type","Size","Value",brand,type,size,value);
    }
}
