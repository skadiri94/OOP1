package com.skpackage.problem.set2;

import jdk.dynalink.beans.StaticClass;

public class MyPoint {

    private int xVal;
    private int yVal;

    public MyPoint(){

        this(0,0);
    }
    public MyPoint(int xVal, int yVal){

        setXVal(xVal);
        setYVal(yVal);
    }

    public void setXVal(int xVal){this.xVal = xVal;}
    public void setYVal(int yVal){this.yVal = yVal;}

    public int getxVal(){return xVal;}
    public int getyVal(){return yVal;}


    public void moveHorizontally(int hUnits){

         xVal+=hUnits;

    }

    public void moveVertically(int vUnits){

             yVal += vUnits;
    }

    public double distanceFromOrigin(){

        return Math.sqrt(xVal*xVal + yVal*yVal);

    }

    public void translate(int hUnits, int vUnits){

        moveHorizontally(hUnits);
        moveVertically(vUnits);

    }

    public String toString(){

        return "(" + getxVal() + "," + getyVal() + ")";
    }

}
