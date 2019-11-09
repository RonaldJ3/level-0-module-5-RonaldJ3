import javax.swing.JOptionPane;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String number = JOptionPane.showInputDialog("Enter a number.")  ;
		 int num = Integer.parseInt(number);
		 if (num % 2 == 0) {
			 JOptionPane.showMessageDialog(null,"That number is even.");
		 } else {
				 JOptionPane.showMessageDialog(null,"That number is odd.");
		 
	}

}
}