package toStringDemo;
class Demo
{
	public String Name;
	public int rollno;
	public Demo(String Name, int rollno)
	{
		this.Name=Name;
		this.rollno=rollno;
	}
	@Override
	public String toString() {
		return "Demo [Name=" + Name + ", rollno=" + rollno + "]";
	}
	
}
public class DemoString 
{

	public static void main(String[] args) 
	{
		Demo d=new Demo("Sai",123);
		System.out.println(d);

	}

}
