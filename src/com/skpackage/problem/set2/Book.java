package com.skpackage.problem.set2;

import javax.swing.*;

public class Book{

    //Attributes of the Book Class.

     private String title;
     private float price;
     private String ISBN;
     private int numberOfPages;

     //the no argument constructions method begins here.
     public  Book(){

      this.title = "No Title";
      this.price = 0;
      this.ISBN =  "";
      this.numberOfPages = 0;

     }//End of No-argument constructor method.

    //the multiple argument constructor
     public  Book(String title, float price, String isbn, int numberOfPages){

         setTitle(title);
         setPrice(price);
         setISBN(isbn);
         setNumberOfPages(numberOfPages);



    }

    //the beginning of accessor methods.
    public String getTitle(){

         //return JOptionPane.showInputDialog(null, "Please Enter the Title: \n" , "Book Title",JOptionPane.INFORMATION_MESSAGE);
        return title;
    }

    public float getPrice(){

        //return Float.parseFloat(JOptionPane.showInputDialog(null, "Please Enter Price: \n" , "Book Price",JOptionPane.INFORMATION_MESSAGE));

        return price;
    }

    public String getISBN(){

        //return JOptionPane.showInputDialog(null, "Please Enter ISBN: \n" , "Book ISBN",JOptionPane.INFORMATION_MESSAGE);

        return ISBN;
    }

    public int getnumberOfPages(){

        //return Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter the Number Of Pages: \n" , "Pages Of Book",JOptionPane.INFORMATION_MESSAGE));

        return numberOfPages;
    }
    //End of Accessor Method.

    //Beginning of Mutator method.
    public void setTitle(String title){

         if(title.equals("")) {
             JOptionPane.showMessageDialog(null, "....", "Error", JOptionPane.ERROR_MESSAGE);
             this.title = "No title";
         }
         else
             this.title = title;
    }

    public void setPrice(float price){

        this.price = price;
    }

    public void setISBN(String isbn){

        this.ISBN = isbn;
    }

    public void setNumberOfPages(int nOP){

        this.numberOfPages =nOP;
    }//End of Mutator Method.

    public String toString(){

         return   "Title: " + title + "\nPrice: " + price + "\nISBN: "  + ISBN + "\nNumber of pages: " + numberOfPages;
    }//End of toString Method which display the content of the object into string.



}


