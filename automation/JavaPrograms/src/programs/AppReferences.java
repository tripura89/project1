package programs;

public class AppReferences {

	public static void main(String[] args) {
      AppUser a1=new Admin(); //upcasting
      a1.View();
      a1.Edit();
      Admin a2= (Admin)a1; //downcasting
       a2.Edit();
      a2.View();
	}

}
class AppUser
{
	public void View()
	{
		System.out.println("U can view details are feeded properly");
	}
	
	public void Edit()
	{
		System.out.println("u can edit in app user only");
	}
}
class Admin extends AppUser
{
	/*public void Edit()
	{
		System.out.println("U can edit the details of any admin");
	}*/
}


/*output:
  U can view details are feeded properly
U can edit the details of any admin
U can edit the details of any admin
U can view details are feeded properly */
 //when we override it takes child class method signature only

//in upcasting it hides the super class method signature and override it
//in downcasting it won't hide the super class method signature whenever there is no implementation
//in subclass it'll use superclass signature and prints it

