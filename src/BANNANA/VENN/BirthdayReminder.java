package BANNANA.VENN;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String mom = "January 24th";
		String dad = "June 9th";
		String my = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Q= JOptionPane.showInputDialog("What Birthday do you want?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, Q);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(Q.equals("mom")){
			JOptionPane.showMessageDialog(null,mom );
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		
		// 6. if user asked for your name
			// print myBirthday
		
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 

}
