import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		
	
	 //Ask the user how many hours they spent coding this week.
	 String hr= JOptionPane.showInputDialog("How many hours of code did you do this week?");
	 // 1. If it's 3 or more, tell them they're a Code Ninja.
	int Hr= Integer.parseInt(hr);
	if((Hr>=3)&&(Hr<=5)){JOptionPane.showMessageDialog(null, "You're a Code Ninja");}
	 //2. If it's less than 2, tell them to stop watching YouTube and write code instead.
	else if(Hr<2){JOptionPane.showMessageDialog(null, "Get off Youtube and write some code! ");}
	 // 3. If it's more than 5, play the Batman theme song.
	else if(Hr>5){playBatmanTheme();}
	}
	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
