package array;

public class RaggedArray 
{

	public static void main(String[] args) 
	{
		int[][] arr1= new int[4][];
		for(int i=0;i<4; i++)
		{
			arr1[i]=new int[i+1];
		}
		int count =1;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.println("*");
				count++;
			}
		}
	}

}
