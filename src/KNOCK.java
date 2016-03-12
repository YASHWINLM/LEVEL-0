import java.util.Random;

import javax.swing.JOptionPane;

public class KNOCK {

	public static void main(String[] args) {
		int num = new Random().nextInt(3);
		if (num == 0) {
			JOptionPane.showInputDialog("Knock knock?");
			JOptionPane.showInputDialog("Cockadodledoo");
			JOptionPane.showMessageDialog(null, "Cockadoodledoo you idiot, not cockadoodledo who!!");
		}
		if (num == 1) {
			JOptionPane.showInputDialog("Knock knock?");
			JOptionPane.showInputDialog("Dozen");
			JOptionPane.showMessageDialog(null, "Dozen anybody want to let me in?");

		}
		if (num == 2) {
			JOptionPane.showInputDialog("Knock knock?");
			JOptionPane.showInputDialog("Robin");
			JOptionPane.showMessageDialog(null, "Robin the bank again!!");
		}

	}
}
