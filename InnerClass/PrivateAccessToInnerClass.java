package InnerClass;
class Outer_Demo1
{
	private final int a=75;
	public class Inner_Demo
	{
		public int getvalue()
		{
			System.out.println("We are inside Inner class");
			return a;
			
		}
	}
}
public class PrivateAccessToInnerClass 
{

	public static void main(String[] args) 
	{
		Outer_Demo1 out=new Outer_Demo1();
		Outer_Demo1.Inner_Demo in=out.new Inner_Demo();
		System.out.println(in.getvalue());
		Class c=in.getClass();
		System.out.println(c.getName());
		

	}

}
