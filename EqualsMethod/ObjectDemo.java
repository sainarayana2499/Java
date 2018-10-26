package EqualsMethod;
class Employee
{
	private int dd;
	private int mm;
	private int yy;
	public Employee(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		result = prime * result + mm;
		result = prime * result + yy;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dd != other.dd)
			return false;
		if (mm != other.mm)
			return false;
		if (yy != other.yy)
			return false;
		return true;
	}
	
}
public class ObjectDemo 
{

	public static void main(String[] args) 
	{
		String str="Hellow";
		String str1=new String("Hellow");
		if(str.equals(str1))
		{
			System.out.println("It is equal");
		}
		else
		{
			System.out.println("This is not equal");
		}
		Employee emp=new Employee(11,2,1999);
		Employee emp1=new Employee(11,2,1999);
		if(emp.equals(emp1))
		{
			System.out.println("It is equal");
		}
		else
		{
			System.out.println("It is not equal");
		}
	}

}
