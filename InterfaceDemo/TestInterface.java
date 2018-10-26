package InterfaceDemo;
interface test
{
	final int steps=10;
	void display();
}
public class TestInterface implements test
{
	public void display()
	{
		System.out.println("Implementing Interfaces");
	}
	public static void main(String[] args) 
	{
		TestInterface ti=new TestInterface();
		ti.display();
		System.out.println(steps);
		

	}

}
