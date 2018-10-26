package array;

public class Array2dDemo 
{
	public static void main(String[] args) 
	{
		String[][] arr1= {{"1","sai"},{"2","nikita"},{"3","rutuja"}};
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length ; j++)
			{
				System.out.println("The names are:"+arr1[i][j]);
			}
		}
		

	}

}
