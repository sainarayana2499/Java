package passbyvalue;

import java.util.Date;

class MyDate
{
	public int day,month,year;
	public MyDate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public String toString() 
	{
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
public class PassByDemo 
{
	public static void swap(MyDate[] arr)
	{
		MyDate temp= arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		
	}
	public static void main(String[] args) 
	{
		MyDate d1=new MyDate(22,8,1997);
		MyDate d2=new MyDate(24,2,1999);
		MyDate[] darr=new MyDate[2];
		darr[0]=d1;
		darr[1]=d2;
		System.out.println("Elements before swapping: ");
		System.out.println(darr[0]);
		System.out.println(darr[1]);
		swap(darr);
		System.out.println("Elements after swapping: ");
		System.out.println(darr[0]);
		System.out.println(darr[1]);
		

	}

}
