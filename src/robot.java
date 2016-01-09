import org.jointheleague.graphical.robot.Robot;

public class robot {
	public static void main(String[] args) {
		Robot bb8=new Robot("");
		
		bb8.penDown();
		bb8.setPenWidth(10);
		bb8.setPenColor(5, 23, 142);
		bb8.setSpeed(8);
		bb8.move(100);
		bb8.turn(-50);
		bb8.move(100);
		bb8.turn(180);
		bb8.move(100);
		bb8.turn(-50);
		bb8.turn(-50);
		bb8.move(100);
		bb8.sparkle();
		bb8.hide();
		
		

		
		
}
	

}
