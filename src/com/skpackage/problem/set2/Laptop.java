package com.skpackage.problem.set2;

import javax.swing.*;

public class Laptop extends Q3Computer {

    private boolean touchScreen;


    public Laptop(){

        this("Unknown ID","Unknown Type","Unknown Type",0,false);
    }

    public Laptop(String id, String make, String type, int size, boolean touchScreen){
        super(id,make,type,size);
        //setId(id);
        //setMake(make);
       // setMemory(new Memory(type,size));
        setTouchScreen(touchScreen);

    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public String toString(){

        return super.toString() + "\n" + String.format("Touch Screen: %s",isTouchScreen());
    }

    public Laptop makeLaptop(){

        Laptop laptop;
        String make,type;
        int size, opt;
        boolean touchScreen = false;

        String id = JOptionPane.showInputDialog(null,"Enter ID: ");

        make = JOptionPane.showInputDialog(null,"Enter Make: ");

        type = JOptionPane.showInputDialog(null,"Enter type: ");

        size = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Size: "));

        opt = JOptionPane.showConfirmDialog(null,"Is it Touch Screen","Selection Option",JOptionPane.YES_NO_OPTION);

        if(opt == JOptionPane.YES_OPTION)
            touchScreen = true;
        //else
        //    touchScreen = false;

        laptop = new Laptop(id,make,type,size,touchScreen);

        return  laptop;

    }


}
