// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
	

		Tortoise bob=new Tortoise();
bob.show();
		//3. ask the user what color they would like the tortoise to draw
		String answer = JOptionPane.showInputDialog("TELL ME A COLOR!!!");
		//4. use an if/else statement to set the pen color that the user requested
		if(answer.equals ("red")){
			bob.setPenColor(Color.RED);
			
		}
		else if (answer.equals("blue")){
			bob.setPenColor(Color.BLUE);
			
		}
//5. if the user doesn’t enter anything, choose a random color
		else{
			bob.setPenColor(Colors.getRandomColor());
			
		}
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		bob.setPenWidth(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
for (int x = 0; x <4; x++) {
	// 		
			bob.setSpeed(10);
			bob.move(100);
			bob.turn(-90);
		

	}}}}




