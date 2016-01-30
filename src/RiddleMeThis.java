import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		String correct = JOptionPane.showInputDialog("What building has the most stories");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (correct.equals("library"))
		{
		JOptionPane.showMessageDialog(null, "correct");
		score +=1;
		} 
		// 5. Otherwise, say "wrong" and tell them the answer
		else
		{ 
			JOptionPane.showMessageDialog(null, "REKT M8!!");
		}
		// 6. Add some more riddles
		correct = JOptionPane.showInputDialog("What is brown and sticky?");
		
		if(correct.equals("A Stick"))
			{JOptionPane.showMessageDialog(null, "correct");
			score +=1;
			}
		
		else 
		{
			JOptionPane.showMessageDialog(null, "REKT M8!!");
			score-=1;
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is "+ score);
	}
}

