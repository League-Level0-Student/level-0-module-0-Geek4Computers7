import javax.swing.JOptionPane;

public class riddleMeThis {public static void main(String[] args) {
	
	int full = 0;
	
		String ohyea = JOptionPane.showInputDialog("What is your name young earthling");
		if (ohyea.equals("Human number 174509927"))
		{
			full = full +1;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorect, your name is Human number 174509927, Everyone one earth will be frozen in 3..2..1");
			
		}
		
		JOptionPane.showMessageDialog(null, "MMMMM");

}
}