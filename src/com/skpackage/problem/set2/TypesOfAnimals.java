package com.skpackage.problem.set2;

import javax.swing.*;

public class TypesOfAnimals {

    public static void main(String []args) {

        String[] continents =  {"Egypt","Australia","African","China"};

       Animal animal = new Animal("Elaphant",continents,500,20);




        JOptionPane.showMessageDialog(null, animal.toString(),"Type of Animals", JOptionPane.INFORMATION_MESSAGE);



    }

}
