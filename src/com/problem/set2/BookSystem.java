package com.problem.set2;

import javax.swing.*;

public class BookSystem {

    public static void main(String []args){

        Book sk, sk2, sk3;

        sk = new Book();
        sk3 = new Book("", 120,"agheo46042654",675);

        JOptionPane.showMessageDialog(null, sk.toString(),"My new Object", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, sk3.toString(),"My new Object", JOptionPane.INFORMATION_MESSAGE);

        String title = JOptionPane.showInputDialog(null, "Please Enter the Title: \n" , "Book Title",JOptionPane.INFORMATION_MESSAGE);

        while(title.equals(""))
        {

        }

        float price = Float.parseFloat(JOptionPane.showInputDialog(null, "Please Enter Price: \n" , "Book Price",JOptionPane.INFORMATION_MESSAGE));

        String isbn = JOptionPane.showInputDialog(null, "Please Enter ISBN: \n" , "Book ISBN",JOptionPane.INFORMATION_MESSAGE);

        int numOfPages = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Number Of Pages: \n" , "Pages Of Book",JOptionPane.INFORMATION_MESSAGE));

        sk2 = new Book(title,price,isbn,numOfPages);

        JOptionPane.showMessageDialog(null, sk.toString() + "\n\n" + sk2.toString() +"\n\n" + sk3.toString(),"My new Object", JOptionPane.INFORMATION_MESSAGE);


    }

}
