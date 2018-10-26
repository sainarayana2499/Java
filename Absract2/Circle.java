package Absract2;

public class Circle extends Shape
{
	public int radius;
	private static final double pi= 3.14;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	@Override
	protected double area() {
		// TODO Auto-generated method stub
		return pi*radius*radius;
	}
	
}
