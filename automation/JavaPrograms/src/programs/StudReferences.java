package programs;
//Compare 1 reference object with another reference of another object
public class StudReferences {
String sname;
int marks,age;

	public static void main(String[] args) {
		StudReferences s11=new StudReferences("pooja.B",450,21);
		StudReferences s22=new StudReferences("pooja.B",450,21);
		System.out.println(s11.equals(s22));
		System.out.println(s11.toString()+"\n"+s22.toString());
   
	}

	public StudReferences(String sname, int marks,int age)
	{
		this.sname=sname;
		this.marks=marks;
		this.age=age;
	}
	public String toString()
	{
		return "student details are:" +sname+" "+marks+" "+age;
	}
	
	public boolean equals(Object o)
	{
		
	//upcasting
	//Object o=new Stud("pooja.a",455,21); this is upcasting for every upcasting we have to do 
	//downcasting like this
	// Stud s1=(Stud) o;
		StudReferences s1=(StudReferences)o;
		String name1=s1.sname;
		String name2=this.sname;
		int age1=s1.age;
		int age2=this.age;
		int marks1=s1.marks;
		int marks2=this.marks;
		if(name1.equals(name2) && age1==age2 && marks1==marks2)
		{
			System.out.println("both are same results is:");
			return true;
		}
		else
		{
			System.out.println("both are not same therefore result is:");
			return false;
		}
	
}
}

/*Output:
 * both are not same therefore result is:
false
student details are:pooja.A 450 21
student details are:pooja.B 455 21
*/
 
/*Output:  here pooja.a=pooja.b arguments are same but with two objects are different
 * both are not same therefore result is
false
student details are:pooja.A 450 21
student details are:pooja.B 450 21

 */
/*both are same results is:
	 true
	 student details are:pooja.B 450 21
	 student details are:pooja.B 450 21 */

 

	