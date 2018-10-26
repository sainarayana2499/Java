package AbstractClass;
abstract class Animal
{
	public void eat()
	{
		System.out.println("Animals eats all kindes of food");
	}
	public abstract void sound();
	
}
class Dog extends Animal
{

	@Override
	public void sound() {
		System.out.println("Dog is barking");
		
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("dog is eating");
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) 
	{
		Animal a=new Dog();
		a.eat();
		a.sound();

	}

}
