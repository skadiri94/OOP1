package com.problem.set2;

import javax.swing.*;

public class Book{

    //Attributes of the Book Class.

     private String title;
     private float price;
     private String ISBN;
     private int numberOfPages;

     //the no argument constructions method begins here.
     public  Book(){

      this.title = "";
      this.price = 0;
      this.ISBN =  "";
      this.numberOfPages = 0;

     }//End of No-argument constructor method.

    //the multiple argument constructor
     public  Book(String title, float price, String isbn, int numberOfPages){

         this.title = getTitle();
         this.price = getPrice();
         this.ISBN = getISBN();
         this.numberOfPages = getnumberOfPages();



    }

    //the beginning of accessor methods.
    public String getTitle(){

         return JOptionPane.showInputDialog(null, "Please Enter the Title: \n" , "Book Title",JOptionPane.INFORMATION_MESSAGE);
    }

    public float getPrice(){

        return Float.parseFloat(JOptionPane.showInputDialog(null, "Please Enter Price: \n" , "Book Price",JOptionPane.INFORMATION_MESSAGE));
    }

    public String getISBN(){

        return JOptionPane.showInputDialog(null, "Please Enter ISBN: \n" , "Book ISBN",JOptionPane.INFORMATION_MESSAGE);
    }

    public int getnumberOfPages(){

        return Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Number Of Pages: \n" , "Pages Of Book",JOptionPane.INFORMATION_MESSAGE));
    }
    //End of Accessor Method.

    //Beginning of Mutator method.
    public void setTitle(String title){

        this.title = getTitle();
    }

    public void setPrice(){

        this.price = getPrice();
    }

    public void setISBN(String isbn){

        this.ISBN = getISBN();
    }

    public void numberOfPages(int nOP){

        this.numberOfPages = getnumberOfPages();
    }//End of Mutator Method.

    public String toString(){

         return   "Title: " + getTitle() + "\nPrice: " + getPrice() + "\nISBN: "  + getISBN() + "\nNumber of pages: " + getnumberOfPages();
    }//End of toString Method which display the content of the object into string.



}


