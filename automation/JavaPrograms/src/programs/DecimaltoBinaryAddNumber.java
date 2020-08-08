package programs;

import java.util.Scanner;

public class DecimaltoBinaryAddNumber {

	public static void main(String[] args) {
		
		
			Scanner in = new Scanner(System.in);
			int num = 0;

			System.out.print("Input a Decimal Number : ");
			num = in.nextInt();

			System.out.println("Binary number is: " + Integer.toBinaryString(num));
			}
			

	}

/*output:
	Input a Decimal Number : 5
	Binary number is: 101  
	
	Input a Decimal Number : 20
    Binary number is: 10100

	*/



