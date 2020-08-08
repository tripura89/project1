package programs;

public class CountWords {

	public static void main(String[] args) {
		
		  String s="we work to live and we live to be happy";
		  int count=0;
		  for(int i=0;i<=s.length()-5;i++)
		  {
		   if(s.charAt(i)=='l'||s.charAt(i+1)=='i'&&s.charAt(i+2)=='v'&&s.charAt(i+3)=='e')
		   {
		    count++;
		   }

		  }
		  System.out.println("frequency of live:"+count);
		 }
		}

	