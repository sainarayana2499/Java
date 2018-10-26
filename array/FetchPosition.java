package array;

import java.util.Scanner;

//Write a Java program to find the index of an array element.
public class FetchPosition 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,9,3,5,7,5,6};
		for(int i=0; i<arr.length ; i++)
		{
			System.out.println("The array is:"+arr[i]);
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find the position of: ");
		int a=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				System.out.println("The position is: "+i);
				break;
			}
		}
	}

}
