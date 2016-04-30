import java.util.Random;

import javax.swing.JOptionPane;

public class Highlow {
public static void main(String[] args) {
	int r=new Random().nextInt(1)+1;
	String g=JOptionPane.showInputDialog("Guess a number");
	int gg;
	for (int i = 0; i < 7; i++)
	{	
	gg=Integer.parseInt(g);
	if(gg<r){
		g = JOptionPane.showInputDialog("Higher");
	}
	else if(gg>r){
		g = JOptionPane.showInputDialog("lower");
	}
	else if(gg==r){
		JOptionPane.showInputDialog("Correct you win a toaster oven just enter your social security, and credit card info");
	}
	}
}
}
