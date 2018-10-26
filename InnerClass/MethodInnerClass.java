package InnerClass;
class Sai
{
	void Method()//start of outer_demo method
	{
		int num=0;
		class Shardul//Start of inner class
		{
			public void print()//start of inner_demo method
			{
				System.out.println("Hellow this is MethodLocalInnerClass with: "+num);
			}
		}//end of the inner class
		//Accessing the inner class in the method itself so that when the method is called the inner class is executed
		Shardul in=new Shardul();
		in.print();
		Class c=in.getClass();
		System.out.println(c.getName());
	}
	
	
}
public class MethodInnerClass 
{

	public static void main(String[] args) 
	{
		Sai s=new Sai();
		s.Method();
		Class c=s.getClass();
		System.out.println(c.getName());

	}

}
