package InnerClass;
class Demo
{
	static class Nested_Demo
	{
		public void Print()
		{
			System.out.println("This is the static inner class");
		}
	}
}
public class StaticNestedClass 
{
	public static void main(String[] args)
	{
		Demo.Nested_Demo in=new Demo.Nested_Demo();
		in.Print();
	}

}
