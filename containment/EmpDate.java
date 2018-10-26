package containment;
public class EmpDate 
{
	public int day,month,year;
	public EmpDate(int day,int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public String toString()
	{
		return "EmpDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
