package programs;

public class StringAscii {

	public static void main(String[] args) {
       String s="java";
       for(int i=0;i<s.length();i++)
       {
    	   int ascii=s.charAt(i);
    	   System.out.println(s.charAt(i)+" "+ascii);
       }
	}

}
