import javax.swing.JOptionPane;

public class numbersorter {
	public static void main(String[] args) {
		String one = JOptionPane.showInputDialog("Enter a number");
		String two = JOptionPane.showInputDialog("Enter a second number");
		String three = JOptionPane.showInputDialog("Enter a third number");

		int num1 = Integer.parseInt(one);
		int num2 = Integer.parseInt(two);
		int num3 = Integer.parseInt(three);

		for (int i = 0; i < 10; i++) {
			int num;
			if (num1 > num2) {
				num = num1;
				num1 = num2;
				num2 = num;
			}
			if (num2 > num3) {
				num = num2;
				num2 = num3;
				num3 = num;
			}
		}
		JOptionPane.showMessageDialog(null, num1 + " " + num2 + " " + num3);
	}
}
