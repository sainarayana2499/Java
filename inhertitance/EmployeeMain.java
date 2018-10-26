package inhertitance;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee emp= new Manager(1,"Sai",1213,4444,8888,222);
		int sal=emp.calculate();
		System.out.println("The salary of the Manager: "+sal);
		emp= new SalesMen(2,"Sai",111,222,55,77);
		int sal1=emp.calculate();
		System.out.println("The salary of th Salemen: "+sal1);
		System.out.println(emp);

	}

}
