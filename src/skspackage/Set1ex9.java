package skspackage;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


public class Set1ex9 {
    public static void main(String[] args) {

        JTextArea textArea = new JTextArea(14, 30);
        Font textFont = new Font("monospaced", Font.PLAIN, 12);
        textArea.setFont(textFont);


        double[] animalWeight  = {234.2, 123.0, 344.8, 455.4, 150.6 , 500, 600, 245.6, 360.9, 500.4};
        float ptg400Abv = 0,total = 0,AvgWeight = 0;
        int Weight250Blw = 0, lightestAnimal = 0;

        String text="";

        for(int i = 0; i < 10; i++) {

            //Listing out all the weights seperated with a ','.
               text += animalWeight[i] + ", ";

               //removing the commar and blank space at the end of the list.
               if(i==9)
                   text += animalWeight[i];

                //getting the number of weight below 250.
               if(animalWeight[i]<= 250)
                   Weight250Blw ++;

               //get the total weight.
               total += (float) animalWeight[i];

        }



        JOptionPane.showMessageDialog(null, "Weights: " + text +
                "\nNumber under 250 kg: " + Weight250Blw + "\nPercentage over 400 kg: " + ptg400Abv +
                "\nLightest animal: " + lightestAnimal + "\nAverage weight: " + total, "Weight Of Animals", JOptionPane.INFORMATION_MESSAGE);



        // textArea.append(String.format("%.2f",x));




        System.exit(0);

    }
}







