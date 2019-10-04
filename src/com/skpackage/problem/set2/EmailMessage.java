package com.skpackage.problem.set2;

import javax.swing.*;

public class EmailMessage {

    public static void main(String []args) {




       Message msg = new Message("Suleman Kadiri","Bleon Ashani");

       //msg.emailAddress("SK","BA");
      // msg.appendMessage("How are you doing Big man??");
        msg.setMessage("How are you doing Big man??");


        JOptionPane.showMessageDialog(null, msg.toString(),"My new Object", JOptionPane.INFORMATION_MESSAGE);



        msg.appendMessage("\nI am doing great hope");
        JOptionPane.showMessageDialog(null, msg.toString(),"My new Object", JOptionPane.INFORMATION_MESSAGE);

    }

}
