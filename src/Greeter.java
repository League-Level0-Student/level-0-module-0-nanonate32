import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) throws Exception {
	String answer =	JOptionPane.showInputDialog(null," What is your name?" );
	JOptionPane.showMessageDialog(null," Hi " + answer );
	}


}
