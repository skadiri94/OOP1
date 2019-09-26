package com.problem.set2;

import javax.swing.*;

public class Message {

    //Attributes of the Book Class.

     private String recipient;
     private String sender;
     private String message;

     //the no argument constructions method begins here.
     public Message(){

      this("No recipeint","No Sender","No Message");

     }//End of No-argument constructor method.

    //the multiple argument constructor
     public Message(String recipient, String sender, String message){

         setRecipient(recipient);
         setSender(sender);
         setMessage(message);

    }

    public Message(String recipient, String sender){

        setRecipient(recipient);
        setSender(sender);
        setMessage("");

    }

    //the beginning of accessor methods.
    public String getRecipient(){ return recipient;}

    public String getSender(){ return sender; }

    public String getMessage(){return message; }


    //End of Accessor Method.

    //Beginning of Mutator method.
    public void setRecipient(String recipient){ this.recipient = recipient;}

    public void setSender(String sender){ this.sender = sender; }

    public void setMessage(String message){this.message = message;}
    //End of Mutator Method.

    //Message email details.

    public void emailAddress(String recipt, String sender){

        setRecipient(recipt);
        setSender(sender);

    }

    //Message append method.
    public void appendMessage(String txt){

        this.message += txt;

    }
    public String toString(){

         return   "From: " + sender + "\nTo: " + recipient + "\n"  + message ;
    }//End of toString Method which display the content of the object into string.



}


