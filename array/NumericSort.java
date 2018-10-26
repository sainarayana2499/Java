package array;

import java.util.Arrays;

public class NumericSort 
{
	public static void main(String[] args) 
	{
		int[] number= {1,87,3,99,4,66,1,828,39816,0};
		String[] arr= {"sai","java","c++"};
		for(int i=0;i<number.length;i++)
		{
			System.out.println("The elements in the array are: "+number[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The elements in the array are: "+arr[i]);
		}
		Arrays.sort(number);
		Arrays.sort(arr);
		for(int i=0;i<number.length;i++)
		{
			System.out.println("The elements afetr sorting are: "+number[i]);
		} 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The elements afetr sorting are: "+arr[i]);
		} 
	}
}