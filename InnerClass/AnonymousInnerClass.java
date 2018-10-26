package InnerClass;
abstract class Anonymous
{
	public abstract void print();
}
interface AnonymousDemo
{
	public void demo();
}
public class AnonymousInnerClass 
{
	public static void main(String[] args) 
	{
		Anonymous a =new Anonymous()
		{
			@Override
			public void print() 
			{
				System.out.println("This is the anonymous class");
				
			}
		};
		AnonymousDemo b=new AnonymousDemo()
		{

			@Override
			public void demo() 
			{
				System.out.println("Interface implemented");
				
			}
			
		};
		a.print();
		b.demo();
	}
}
