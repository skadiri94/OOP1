package com.problem.set2;

public class Animal {


    private String type;
    private String [] continents;
    private double weight;
    private int age;


    //the no argument constructions method begins here.
public Animal(){
    this("No Type",null ,0.0,0);
}

    //the multiple argument constructions method begins here.

public Animal(String t, String[] c, double w, int a){

    setType(t);
    setContinents(c);
    setWeight(w);
    setAge(a);
}

//The mutator method begin's here.

public void setType(String type){
    this.type = type;
}

public void setContinents(String[] continents){
    this.continents = continents;
}

public void setWeight(double weight){
    this.weight = weight;
}

public void setAge(int age){
    this.age = age;
}

//The accessor method begins here

public String getType(){return type;}

public String[] getContinents(){return continents;}

public double getWeight(){return weight;}

public int getAge(){return age;}


    public String toString(){

        String txt = "";

        for(int i = 0; i < continents.length; i++) {

            txt += continents[i] + "\n";

        }

        return   "Type: " + getType() + "\nContinent: " + txt + "\nWeight: "  + getWeight() +
                "\nAge: " +getAge();
    }//End of toString Method which display the content of the object into string.

}




