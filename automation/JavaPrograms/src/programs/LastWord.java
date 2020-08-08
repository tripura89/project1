package programs;

import java.util.Scanner;

public class LastWord {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter String");
     String s=sc.nextLine();
     String w[]=s.split("  []+ ");
     System.out.println("last word" +w[w.length-2]);
     System.out.println("2 last word" +w[w.length-3]);
     
	}

}
