package programs;

import java.util.Scanner;

public class MultiplyingBinaryNumbers {

	public static void main(String[] args) {
		String b1,b2;

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st binary no. : ") ;
		b1=sc.next();
		System.out.println("Enter 2nd binary no. : ") ;
		b2=sc.next();
		int num1=Integer.parseInt(b1,2);
		int num2=Integer.parseInt(b2,2);
		int mul=num1*num2;
		System.out.println("Multipilcation is : "+Integer.toBinaryString(mul));
		
	}
		
	}
/*
 Enter 1st binary no. : 
101010
Enter 2nd binary no. : 
111111
Multipilcation is : 101001010110
*/


