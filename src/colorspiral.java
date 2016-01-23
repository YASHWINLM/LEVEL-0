import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class colorspiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot k3po= new Robot();
		// 5. Set your robot's pen to the down position
		k3po.penDown();
		k3po.sparkle();
		// 3. Set the robot to go at max speed (10)
		k3po.setSpeed(10);
		// 4. Do the following (steps 7-9) 75 times
		for (int i = 0; i < 1000; i++) {
			
			// 7. Change the pen color to random
			k3po.setRandomPenColor();
			// 6. Move the robot 5 times the current loop number (5*i)
			k3po.move(5*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			k3po.turn(360/7);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
			
			// 9. Set the pen width to i
			k3po.setPenWidth(i);
	}}
}




