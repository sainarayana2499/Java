package containment;
public class EmpMain 
{
	public static void main(String[] args)
	{
		EmpDate empd=new EmpDate(24,2,1999);
		Employee emp=new Employee(1,"Sai","Pune",empd);
		System.out.println(emp);
	}
}
