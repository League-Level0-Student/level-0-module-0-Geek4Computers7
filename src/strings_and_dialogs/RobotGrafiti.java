import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiti {
	 public static void main(String[] args) {
		 Robot squirtboy = new Robot();
		 squirtboy.setSpeed(90);
		 squirtboy.penDown();
		 squirtboy.turn(90);
		 squirtboy.move(300);
		 squirtboy.turn(-180);
		 squirtboy.penUp();
		 squirtboy.move(150);
		 squirtboy.turn(-90);
		 squirtboy.penDown();
		 squirtboy.move(300);
		 squirtboy.turn(135);
		 squirtboy.move(200);
		 JOptionPane.showMessageDialog(null,"Oh no, The police. RUN");
		 
	}

}
