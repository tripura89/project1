package programs;

public class Upcasting {

	public static void main(String[] args) {
		//Police p1=new Police(); normal superclass creation
		Police p1=new BoyFriend(); 
		//upcasted object: converting sub class object type into super class object type is called upcasting
		p1.lockdown(); //compiles successfully
		//if we don't create the method in super class 
		p1.meetingGirlFriend(); // compile time error because during upcasting subclass behaviour is not visible
		}
}

 //here super class behaviour is hiding only subclass methods are printing overriding concept is going on
class Police
{
	public void lockdown()
	{
		System.out.println("stay at home");
	}

	public void meetingGirlFriend() {
	 
		System.out.println("She wants to see me");
		
	}
}
class BoyFriend extends Police
{
	public void lockdown()
	{
		System.out.println("no matter what happens i will go out for her");
	}
	public void meetingGirlFriend()
	{
		System.out.println("want to see her only once");
	}
}