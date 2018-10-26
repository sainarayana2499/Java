package InterfaceDemo;
interface sum
{
	void Arithmetic(int a);
}
public class SumOfDivisiors implements sum 
{
	int count=0;
	@Override
	public void Arithmetic(int num) 
	{
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				count=count+i;
			}
		}
		System.out.println("The addition is: "+count);
		
	}
	public static void main(String[] args)
	{
		SumOfDivisiors sod=new SumOfDivisiors();
		sod.Arithmetic(20);

	}

	

}
