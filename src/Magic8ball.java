// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int lucky = new Random().nextInt(3);
	// 3. Print out this variable
	System.out.println(lucky);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Ask a question");
	// 5. If the random number is 0
	if(lucky==0)
	{
	// -- tell the user "Yes"
	JOptionPane.showMessageDialog(null, "YEEE");
	}
	// 6. If the random number is 1
	else if (lucky==1)
	{
	// -- tell the user "No"
	JOptionPane.showMessageDialog(null, "NEIN");
	}
	// 7. If the random number is 2
	else if (lucky==2)
	{
	// -- tell the user "Maybe you should ask Google?"
		JOptionPane.showMessageDialog(null, "ASK BING");
		JOptionPane.showMessageDialog(null, "NAW JK, ASK goo.gol");
		JOptionPane.showMessageDialog(null, "NYO JK LOL, Ask Google");
	}
	// 8. If the random number is 3
	else if (lucky==3)
	{
	// -- write your own answer
	JOptionPane.showInputDialog("I sorry your time has expired please input credit card info for more time.");
	
	}
}}


