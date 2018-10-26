package Cloning;
class Employee implements Cloneable
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
	protected Employee clone() throws CloneNotSupportedException 
	{
		return (Employee)super.clone();
	}
	@Override
	public String toString() 
	{
		return super.toString();
	}
	
}
public class Cloning 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee emp1=new Employee(11,2,1999);
		Employee emp2=emp1.clone();
		System.out.println(emp1.hashCode());
		System.out.println(emp1.hashCode());

	}

}
