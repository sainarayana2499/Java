package HashCodeDemo;
class HashDemo implements Cloneable
{
	private int dd,mm,yy;
	public HashDemo(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (HashDemo)super.clone();
	}
	
}
public class Demo 
{
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		HashDemo d=new HashDemo(11,2,1999);
		HashDemo d1=new HashDemo(22,3,1998);
		Object d2=(HashDemo) d1.clone();
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}

}
