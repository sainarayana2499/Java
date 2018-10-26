package array;

import java.util.Arrays;
import java.util.Scanner;

public class RmoveElement 
{
	public static void main(String[] args) 
	{
		int flag = 0;
		int loc =0;
		int[] arr= {1,2,3,4,5,6,55,99,22,44};
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("The array is:"+arr[i]);
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to delete");
		int a=sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==a)
			{
				flag=1;
				loc=i;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			for(int i=loc+1; i<arr.length;i++)
			{
				arr[i-1]=arr[i];
			}
			System.out.println("The array after deletion is: ");
			for(int i=0;i<arr.length-2;i++)
			{
				System.out.println(arr[i]+"\t");
			}
		}
		else
		{
			System.out.println("Number not found");
		}
			

	}

}
