package AbstractClass;

import javax.swing.plaf.synth.SynthScrollBarUI;

abstract class Base
{
	public Base()
	{
		System.out.println("Base class Constructor is called");
	}
	public abstract void fun();
}
class Derived extends Base
{
	public Derived()
	{
		System.out.println("Derived class constructor is called");
	}

	@Override
	public void fun() 
	{
		System.out.println("Nach na bhai");
		
	}
}
public class AbstractConstruct {

	public static void main(String[] args)
	{
		Base b=new Derived();
		b.fun();

	}

}
