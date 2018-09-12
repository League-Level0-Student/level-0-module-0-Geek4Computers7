import javax.swing.JOptionPane;

public class EveryThingIsAwesome {
	public static void main(String[] args) {
		String life = JOptionPane.showInputDialog("What is your favorite thing about life?");
		JOptionPane.showMessageDialog(null, (life + " is AMAZING"));
	}

}
