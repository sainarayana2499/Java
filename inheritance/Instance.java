package inheritance;



public class Instance 
{

	public static void main(String[] args) 
	{
		Animal a=new Animal("Animal",1,1,5,5);
		Dog d=new Dog("German",20,2,4,1,20,8,"GoldenBlack");
		d.eat();
		d.walk();
		d.run();
		
	}

}
