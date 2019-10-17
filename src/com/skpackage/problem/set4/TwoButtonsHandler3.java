package com.skpackage.problem.set4;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/** Frame class with one inner button-handling classes
 *  and one anonymous inner class that implements actionlistener itself 
 */
public class TwoButtonsHandler3 extends JFrame {
    // declare buttons outside of any method
	JButton okButton, cancelButton;
	/** driver creates and displays the window */
	public static void main(String args[]){
		TwoButtonsHandler3 win = new TwoButtonsHandler3();
		win.setVisible(true);
	}
	
	public TwoButtonsHandler3(){
		   // customise the window
			setTitle("Window with 2 buttons");
			setSize(300,200);
			setLocation(250,200);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		   // customise the content pane
			Container cPane = getContentPane();
			cPane.setBackground(Color.cyan);
			cPane.setLayout(new FlowLayout());
			// create and add buttons
			okButton = new JButton("OK");
			cancelButton = new JButton("Cancel");
			cPane.add(okButton);
			cPane.add(cancelButton);
			// add listeners for the buttons: separate private inner class for each
			//anonymous inner class that implements the ActionListener Interface
			okButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
		  			JOptionPane.showMessageDialog(null,"You clicked OK!");
				} // end actionPerformed
  			}); // end anonymous inner class
  
			//
			cancelButton.addActionListener(new CancelButtonHandler());
	} // end constructor

  //inner class
  private class CancelButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		  JOptionPane.showMessageDialog(null,"You clicked Cancel!");
	} // elass which handles clicks on the cancel button */
   //end actionPerformed
  } // end CancelButtonHandler inner class
}// end TwoButtonsHandler2 class

  
  				