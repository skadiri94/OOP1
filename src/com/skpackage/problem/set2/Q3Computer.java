package com.skpackage.problem.set2;

public class Q3Computer implements  IDable{

    private String id;
    private String make;
    protected Memory memory;

    public Q3Computer(){
        this("Unknown ID","Unknown Make",0);
    }

    public Q3Computer(String make){
        this("Unknown ID",make,0);
    }


    public Q3Computer(String id,String make,int memory){

        setId(id);
        setMake(make);
        setMemory(new Memory(memory));
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public Memory getMemory() {
        return memory;
    }


    public String toString() {

        return String.format("ID: %s\nMake: %s\nMemory %s",getId(),getMake(),getMemory());

    }

    public void setID(String Id){

    }
}
