package ImmutableClass;
final class Student
{
	final String stud_name;
	final int stud_number;
	public Student(String stud_name,int stud_number)
	{
		this.stud_name=stud_name;
		this.stud_number=stud_number;
	}
	public String getstud_name()
	{
		return stud_name;
	}
	public int getstud_number()
	{
		return stud_number;
	}
	
}
public class ImmutableDemo 
{
	public static void main(String[] args) 
	{
		Student stud=new Student("Sai",213);
		System.out.println(stud.stud_name);
		System.out.println(stud.stud_number);
		//stud.stud_name="Sareen";// this will cause an error as the class is final and no changes can be done
	}

}
