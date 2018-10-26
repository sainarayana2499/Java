package array;

import java.util.Scanner;

//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
public class FindSum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the sum: ");
		int ans=sc.nextInt();
		int[] array= {11,22,88,33,2,5,7,9,3,1,4,5,6};
		System.out.println("The array is:");
		for(int i=0; i<array.length ; i++)
		{
			System.out.println(array[i]);
		}
		for(int i=0; i<array.length ; i++)
		{
			for(int j=0; j<array.length ; j++)
			{
				if(array[i]+array[j]==ans)
				{
					System.out.println(array[i]+"+"+array[j]+"="+ans);
					break;
				}
			}
		}
	}

}
