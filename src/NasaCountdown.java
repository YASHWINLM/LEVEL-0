import javax.swing.JOptionPane;

public class NasaCountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
	String answer=	JOptionPane.showInputDialog("When do you want to start?");
		// 3. convert the user's answer to an int (Integer.parseInt)
			int start=Integer.parseInt(answer);
		// 4. countdown from user's starting point
		
	// 1. countdown from 10 to 0
		for (int i = start; i > -1; i--) {
			speak(""+i);
			JOptionPane.showMessageDialog(null, i);
		}
		// 5. when the counting is done, print "blastoff!"
			speak("MEME EXTREME CONFIRMED!");
		
	
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}

