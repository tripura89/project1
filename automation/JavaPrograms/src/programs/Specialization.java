package programs;

public class Specialization {

	public static void main(String[] args) 
	{
           dogdetails(new Dog());
           catdetails(new Cat());
	}

	public static void dogdetails(Dog d) //Dog d=new Dog()
	{
		d.eat();
		d.makesound();
	}
	public static void catdetails(Cat c)//Cat c=new Cat()
	{
		c.eat();
		c.makesound();
	}
}
interface Animal
{
	void eat();
	void makesound();
}
class Dog implements Animal
{
	public void eat()
	{
		System.out.println("Dog eats biscuits");
	}
	public void makesound()
	{
		System.out.println("Bow bow bow");
	}
}
class Cat implements Animal
{

	@Override
	public void eat() {
		System.out.println("cat eats chicken");
	}

	@Override
	public void makesound() {
      System.out.println("meow meow meow");		
	}
	
}
	


