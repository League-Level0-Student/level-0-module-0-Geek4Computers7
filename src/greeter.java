import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
	String nme = 	JOptionPane.showInputDialog(null, ("what is your name"));
	JOptionPane.showMessageDialog(null, ("Hi "+ nme));
	}

}
