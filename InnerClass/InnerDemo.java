package InnerClass;
class Outer_Demo
{
	private int num;
	private class Inner_Demo
	{
		public void print()
		{
			System.out.println("This is the innner class");
		}
	}
	public void display_inner()
	{
		Inner_Demo id=new Inner_Demo();
		id.print();
	}
}
public class InnerDemo 
{
	public static void main(String[] args) 
	{
		Outer_Demo od=new Outer_Demo();
		od.display_inner();
		//only applicable when the inner class is public else it will show a compile time error
		/*Outer_Demo.Inner_Demo in =new Outer_Demo().new Inner_Demo();
		in.print();*/
	}
}
