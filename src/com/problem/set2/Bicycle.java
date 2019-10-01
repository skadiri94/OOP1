
/*This model a Bicycle. It should have the following attributes: owner’s name, value, and make,with accessors and mutators for each. It should have a no-args constructor,
 one which takes values for all the attributes and a toString() method.

*/

package com.problem.set2;

public class Bicycle {

    private String ownerName;
    private String make;
    private float value;

    public Bicycle(){
        this("Empty","Empty",0f);
    }

    public Bicycle(String ownerName, String make, float value){
        setOwnerName(ownerName);
        setMake(make);
        setValue(value);

    }

    public void setOwnerName(String ownerName){ this.ownerName = ownerName;}
    public void setMake(String make){this.make = make;}
    public void setValue(float value){this.value = value;}

    public String getOwnerName(){return ownerName;}
    public String getMake(){return make;}
    public float getValue(){return value;}

    public String toString(){

        return String.format("\nOwner: %s\nMake: %s\nValue: %.2f",getOwnerName(),getMake(),getValue());
    }


}
