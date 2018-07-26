package initlization;

public class Leaf 
{
	int i=0;
	Leaf increment()
	{
		i++;
		System.out.println(this);
		return this;
	}
	
	void print()
	{
		System.out.println("i = "+i);
	}
	
	public static void main(String[] args) 
	{
		Leaf x =new Leaf();
		x.increment().print();;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
