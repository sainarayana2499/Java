package Absract2;

import java.util.Scanner;

public class AbstractMain 
{
	public static void main(String[] args) 
	{
		int r;
		int l;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r=sc.nextInt();
		System.out.println("Enter the length: ");
		l=sc.nextInt();
		System.out.println("Enter the breath: ");
		b=sc.nextInt();
		Shape s=new Circle(r);
		Shape s1=new Rectangle(l,b);
		double area=s.area();
		double area2=s1.area();
		System.out.println(area);
		System.out.println(area2);
		
	}

}
