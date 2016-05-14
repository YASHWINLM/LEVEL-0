import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	for (int i = 1; i < 6; i++) {
		
	
	int l=new Random().nextInt(100)+1;
	JOptionPane.showMessageDialog(null, l);
	}	
}
}
