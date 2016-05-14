import javax.swing.JOptionPane;

public class Voting {
	public static void main(String[] args) {
		String vote=JOptionPane.showInputDialog("Who would you vote for?");
		if(vote.equals("Trump")){
			JOptionPane.showMessageDialog(null, "Did you buy your weed from a hobo on the side of the road in a dirty plastic baggie for $5 ??!!!?");
		}
		String age=JOptionPane.showInputDialog("How old are you?");
	int AGE=Integer.parseInt(age);
	if(AGE>=18){
		JOptionPane.showMessageDialog(null, vote +  "will be the next president!");
	
}
	else if(AGE<18){
		JOptionPane.showMessageDialog(null, "SCREW OFF!");
	}
	}

}
