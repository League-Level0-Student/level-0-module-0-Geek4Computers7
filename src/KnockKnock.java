import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		
	
		String who = JOptionPane.showInputDialog("Knock Knock");
		if (who.equalsIgnoreCase("who is there")) { 
			 JOptionPane.showMessageDialog(null, ("Doctor"));} 
		JOptionPane.showMessageDialog(null, ("Doctor who you might say and you would be CORRECT"));
				
		}
	}



