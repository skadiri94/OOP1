package com.skpackage.problem.set2;

import javax.swing.*;

public class MyFlicks {

    public static void main(String[] args) {

        int i = 0;

        Film[] catalog = new Film[10];
        String title, director;
        int duration;



        while (JOptionPane.showConfirmDialog(null, "Would you Like to Enter a Movie Detail ?",
                "Catalog", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            title = JOptionPane.showInputDialog(null, "Enter Movie Title:");

            director = JOptionPane.showInputDialog(null, "Enter Director Name: ");

            duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Duration Of Movie: "));

            catalog[i] = new Film(title, director, duration);

            i++;

        }

        //for (int j = 0; j < catalog.length; j++) System.out.println("\n" + catalog[j].toString());


        displayFilms(catalog);


    }

    public static void displayFilms(Film[] a){

        int filmCount = Film.getFilmCount();

        JTextArea jta = new JTextArea();
        jta.setText("Number of Films: " + "\n\n");

        for(int i = 0; i < 1; i ++){

            jta.append(a[i].toString() + "\n\n");

        }
    System.out.println(jta);

        JOptionPane.showMessageDialog(null,jta,"Catalog",JOptionPane.INFORMATION_MESSAGE);

    }
}
