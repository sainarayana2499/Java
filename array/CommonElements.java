package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElements 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first size of the array: ");
		int n=sc.nextInt();
		int[] arr1=new int[n];
		for (int i : arr1) 
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the second size of the array: ");
		int m=sc.nextInt();
		int[] arr2=new int[m];
		HashSet<Integer> set=new HashSet<Integer>();
		for (int i : arr2) 
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					set.add(arr1[i]);
				}
			}
		}
		
			System.out.println(set);
	}

}
