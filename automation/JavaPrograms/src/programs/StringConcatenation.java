package programs;

public class StringConcatenation { //concatenation is adding 

	public static void main(String[] args) {
      int a=100;
      int b=200;
      String x="Hello";
      String y="World";
      double c=12.33;
      double d=10.33;
      System.out.println(a+b);
      System.out.println(x+y);
      System.out.println(a+b+x+y); //300HelloWorldexecution starts from left to right:300helloworld
      System.out.println(x+y+a+b); //*****Its important helloworld will be added to 100 and 200
      //so execution starts from here left to right output will be HelloWorld100200
      System.out.println(x+y+a);
      System.out.println(x+y+(a+b)); 
      //if we give in separate bracket the output will be (x+y+(a+b))=HelloWorld300
      System.out.println(a+b+x+y+a+x+b+y);
      System.out.println(a+b+x+y+a+b);
      System.out.println(c+d);
      System.out.println(x+y+c+d);
      System.out.println(x+y+(c+d));
      
	}

}
