import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class secretMessage {

	public static void main(String[] args) {
		String pscde = ("2007");
		
		String shh = JOptionPane.showInputDialog("Enter a secret");
		String userpscde = JOptionPane.showInputDialog(null, "ENTER PASSCODE");

		if (userpscde.equals("2007"))

		{
			JOptionPane.showMessageDialog(null, shh);
		}

		else {
			JOptionPane.showMessageDialog(null, "intuder alert");
			playsound();
		}

	}

	public static void playsound() {
		
	}

}
