package Absract2;

public class Rectangle extends Shape
{
	public int length;
	public int breath;
	public Rectangle(int lenght,int breath)
	{
		this.breath=breath;
		this.length=lenght;
	}
	@Override
	protected double area() {
		// TODO Auto-generated method stub
		return length*breath;
	}

}
