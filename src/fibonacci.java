
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int c = 0;
//inside a for loop this what I need to do
//and add a and b
//then print a+b=c
//I need to move a and b

		for (int count = 0; count <= 11; count++) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
	}

}
