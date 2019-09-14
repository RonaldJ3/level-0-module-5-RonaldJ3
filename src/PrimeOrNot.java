import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = JOptionPane.showInputDialog(null, "Give me a number.");
		int doom = Integer.parseInt(val);
		for (int i = 2; i <= doom - 1; i++) {
			if (doom % i == 0) {
				JOptionPane.showMessageDialog(null, "Sorry not prime.");
				System.exit(0);
			}
		}

		JOptionPane.showMessageDialog(null, "It is prime.");

	}
}
