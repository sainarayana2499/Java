package InstanceOF;
class Employee
{
	public void show()
	{
		System.out.print("Employee Show method has been called");
	}
}
class Manger extends Employee
{
	public void display()
	{
		System.out.println("This is managers display function");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Mangers show method has been called");
	}
}
class Sales extends Employee
{
	public void display()
	{
		System.out.println("This is managers display function");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Sales show method has been called");
	}
}
public class InstanceDemo 
{
	public static void call(Employee emp) 
	{
		if(emp instanceof Manger)
		{
			((Manger)emp).show();
		}
		if(emp instanceof Sales)
		{
			((Sales)emp).show();
		}

	}

	public static void main(String[] args) 
	{
		Employee emp1=new Manger();
		call(emp1);
		Employee emp2=new Sales();
		call(emp2);

	}

}
