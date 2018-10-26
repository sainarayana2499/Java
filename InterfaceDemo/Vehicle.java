package InterfaceDemo;
interface transport
{
	void changegear(int a);
	void speedup(int a);
	void applybrakes(int a);
}
class bike implements transport
{
	int speed;
	int gear;
	@Override
	public void changegear(int newgear)
	{
		gear=newgear;
	}
	@Override
	public void speedup(int increment) 
	{
		speed=speed+increment;
	}
	@Override
	public void applybrakes(int decrement)
	{
		speed=speed-decrement;		
	}
	@Override
	public String toString() 
	{
		return "bike [speed=" + speed + ", gear=" + gear + "]";
	}
	
	
}
class car implements transport
{
	int speed;
	int gear;
	@Override
	public void changegear(int newgear)
	{
		gear=newgear;
	}
	@Override
	public void speedup(int increment) 
	{
		speed=speed+increment;
	}
	@Override
	public void applybrakes(int decrement)
	{
		speed=speed-decrement;		
	}
	@Override
	public String toString() {
		return "car [speed=" + speed + ", gear=" + gear + "]";
	}
	
}
public class Vehicle 
{
	public static void main(String[] args)
	{
		bike b=new bike();
		b.changegear(12);
		b.applybrakes(45);
		b.speedup(78);
		System.out.println("Bikes present state is: ");
		System.out.println(b);
		car c=new car();
		c.applybrakes(32);
		c.changegear(78);
		c.speedup(90);
		System.out.println("Car's present sate is: ");
		System.out.println(c);
		
		

	}

}
