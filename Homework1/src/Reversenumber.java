import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		
		//scanner needed to obtain user input
		Scanner input = new Scanner(System.in);
		
		// Request from user
		System.out.println("Please enter a number you would like the reverse of: ");
		
		//obtains user input
		int Input =input.nextInt();
		
		// need for while function need to set to 0 to do first run
		int Reverse = 0;
		// will output 0 when 0 is entered and skip while function
		int Remainder = 0;
		
		// As long as the remaining number is not 0 the function will run
		// Last line of code will divide the last number by 10 since it doesn't read decimals code will turn to 0
		while (Input != 0){
			
			// using to determine the remainder if input is 123 remainder is 3, this is the first variable
			Remainder = Input %10;
			
			// orginally set  0 * 10 = 0 + 3 creates the first number in reverse order, 
			//*10 to move to next value digit then adds on new remainder
			 Reverse = Reverse * 10 + Remainder;
			
			// 123/10 creates 12 this resets the input value and causes the loop to start over
			Input = Input / 10;
			
		}
			
			System.out.println("The reverse number is: " + Reverse);
			
			
			
			
					
			
			
			
			
		
	
	}
}



