package GetClassName;
class Employee
{
	private int Roll_no;
	private String name;
	public Employee(int Roll_no,String name)
	{
		this.Roll_no=Roll_no;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [Roll_no=" + Roll_no + ", name=" + name + "]";
	}
	
}
class Manger extends Employee
{
	public int accno;

	public Manger(int Roll_no, String name, int accno) {
		super(Roll_no, name);
		this.accno=accno;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Manger [super(Employee),accno=" + accno + "]";
	}
	
	
}
public class ClassName
{

	public static void main(String[] args) 
	{
		Object obj=new String("Sai");
		Object obj1=new Employee(45,"Sai");
		Class c=obj.getClass();
		Class c1=obj1.getClass();
		Employee obj3=new Manger(1,"sai",1231);
		Class c2=obj3.getClass();
		System.out.println("The class of object is "+c.getName());
		System.out.println("THe class of object obj1 is "+c1.getName());
		System.out.println("The class of the bject obj3 is "+c2.getName());

	}

}
