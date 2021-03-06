package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	Robot rob = new Robot();

	void settings() {
		rob.penDown();
		rob.setSpeed(100);
		rob.setRandomPenColor();
		rob.setPenWidth(5);
		rob.setPos(new Random().nextInt(700) + 100, new Random().nextInt(400) + 100);
	}

	void circle() {
		settings();
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(1);
		}
		rob.hide();
	}

	void square() {
		settings();
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
		rob.hide();
	}

	void triangle() {
		settings();
		for (int i = 0; i < 3; i++) {
			rob.move(100);
			rob.turn(120);
		}
		rob.hide();
	}
	
	static void draw(int number) {
		if (number == 0)
			new ObedientRobot().circle();
		else if (number == 1)
			new ObedientRobot().square();
		else if (number == 2)
			new ObedientRobot().triangle();
		else
			System.exit(0);
	}

	public static void main(String[] args) {

		/*
		 * Create methods to draw a circle, square and triangle and call the appropriate
		 * one depending on the user choice.
		 */
		
		int answer = 0;
		do {
			int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
			draw(shape);
			answer = JOptionPane.showConfirmDialog(null, "Do you want to draw another shape?", "",
					JOptionPane.YES_NO_OPTION);
		}while(answer == 0);

	}
}
