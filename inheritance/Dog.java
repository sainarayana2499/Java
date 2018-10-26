package inheritance;

public class Dog extends Animal
{
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) 
	{
		super(name, 1, 1, size, weight);
		// TODO Auto-generated constructor stub
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
		this.coat=coat;
	}
	private void chew()
	{
		System.out.println("Dog.chew() Called");
	}
	@Override
	public void eat()
	{
		System.out.println("Dog.eat() cALLED");
		chew();
		super.eat();
	}
	public void walk()
	{
		System.out.println("Dog.walk() Called");
		super.move(500000);
	}
	public void run()
	{
		System.out.println("Dog.run() called");
		super.move(1323232);
	}
}
