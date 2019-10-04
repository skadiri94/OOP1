package com.skpackage.problem.set2;

import javax.swing.*;
import java.util.GregorianCalendar;
import java.util.*;

public class DaysCalWithDates {


    public static void main(String[] args) {

        GregorianCalendar borrowedDate,returnDate;
        int mnth,day,year;
        long diff;

        day = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Date Borrowed: "));

        mnth = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Month Borrowed: "));

        year = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Year Borrowed: "));

        borrowedDate = new GregorianCalendar(year,mnth,day);

        int bday = borrowedDate.get(Calendar.DAY_OF_YEAR);



       /* day = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Date returned: "));

        mnth = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Month returned: "));

        year = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Year returned: "));

        returnDate = new GregorianCalendar(year,mnth,day);

        int rday = returnDate.get(Calendar.DAY_OF_YEAR);



        diff = rday - bday;*/

       Date dt = new Date();

      // int rday = dt.getTime();

        System.out.println(dt);


    }
}
