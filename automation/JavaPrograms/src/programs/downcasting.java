package programs;

public class downcasting {

	public static void main(String[] args) {
      Police1 p1=new BoyFriend1();
      p1.lockdown();
     // p1.meetingGirlFriend();//cte
      BoyFriend1 b1= (BoyFriend1) p1;
      //BoyFriend b1=new BoyFriend();
      b1.lockdown();
      b1.meetingGirlFriend();
	}

}
//here superclass method is not hiding based on runtime object it is working
//here also overriding is possible
class Police1
{
	public void lockdown()
	{
		System.out.println("stay at home");
	}
}
class BoyFriend1 extends Police1
{
	//when we comment below method superclass method is printing otherwise we do not comment
	//this method sub class mehtod is printing
	/*public void lockdown()
	{
		System.out.println("i want to go anyway");
	}*/
	public void meetingGirlFriend()
	{
		System.out.println("Want to see her only once");
	}
}

