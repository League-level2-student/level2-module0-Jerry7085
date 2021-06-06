package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] ro = new Robot[5];


	//3. use a for loop to initialize the robots.
for (int i = 0; i < ro.length; i++) {
	ro[i] = new Robot();
	ro[i].setX(100+100*i);
	ro[i].setY(500);
	ro[i].setAngle(0);
	ro[i].setSpeed(20);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random ran = new Random();
boolean robrace = true;
while(robrace) {
for (int i = 0; i < ro.length; i++) {
	ro[i].move(ran.nextInt(50));
	if(ro[i].getY()<= 0) {
	JOptionPane.showMessageDialog(null, i+"won");
	robrace = false;
	break;
	}
}
}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}