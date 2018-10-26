package array;

import java.util.Scanner;

public class Array2D 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		String[] arr1 = new String[size];
		for(int i=0 ; i<size ; i++)
		{
			arr1[i]=sc.next();
		}
		for(int i=0 ; i<size ; i++)
		{
			System.out.println("The names are:"+arr1[i]);
		}
	}

}
