package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements into the array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The array in ascending order is: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		for(int j=0;j<n/2;j++)
		{
			temp=arr[j];
			arr[j]=arr[arr.length-j-1];
			arr[arr.length-j-1]=temp;
		}
		System.out.println("The array in descending order is: "+Arrays.toString(arr));
		
	}

}
