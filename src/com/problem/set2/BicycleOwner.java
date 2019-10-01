/*Write a driver which
•	Asks the user to enter a name, value and make and creates a Bicycle with these attributes
•	Declares and creates a Bicycle using the no-arguments constructor, then asks the user to
enter a value for each of the attributes of this second Bicycle and sets them accordingly
•	Increases the value of the first Bicycle by 10 euro by getting the value, then setting it to
an increased value Outputs the owner names and values of the 2 Bicycles using the accessor methods.
•	Calculates and displays the total value of the 2 Bicycles */

package com.problem.set2;

import javax.swing.*;

public class BicycleOwner {

    public static void main(String[]args){

        JTextArea jta = new JTextArea("BICYCLE DETAILS\n");


        Bicycle [] bicycles = new Bicycle[2];


        String owner, make;
        float value;

        for(int i=0; i<bicycles.length;i++){

           owner =  JOptionPane.showInputDialog(null,"Enter Owner's Name: ");

            make = JOptionPane.showInputDialog(null,"Enter Make: ");

            value = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter Value: "));

            bicycles[i] = new Bicycle(owner,make,value);

        }

        for(int i=0; i<bicycles.length;i++){

            jta.append(bicycles[i].toString() + "\n");

        }

        JOptionPane.showMessageDialog(null,jta,"Bicycle Details",JOptionPane.INFORMATION_MESSAGE);


    }


}
