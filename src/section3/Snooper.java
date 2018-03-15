package section3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("");
		JOptionPane.showMessageDialog(null, "Hi " + s);
	}
}
