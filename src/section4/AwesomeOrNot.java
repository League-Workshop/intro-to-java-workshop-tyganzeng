package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		
		int randNum = new Random().nextInt(4);
		
		// 3. Print out this variable
		System.out.println(randNum);
		// 4. Get the user to enter something that they think is awesome
		String y = JOptionPane.showInputDialog("Enter something awesome");
		// 5. If the random number is 0
		switch (randNum) {
		case 0 : 	System.out.println(y + " is awesome!");
		break;
		case 1 : System.out.println(y + " is ok"); 
		break;
		case 2 : System.out.println(y + " is boring");
		break;
		case 3: System.out.println(y + " is cool");
		break;
		}
			
		
		// -- tell the user whatever they entered is awesome!

		// 6. If the random number is 1

		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2

		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3

		// -- write your own answer
	}
	

}


