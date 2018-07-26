package initlization;

public class UsingThis {
	
	int a=1,b=2,c=0;
	
	void sum()
	{
		c=a+b;
		//return this;
	}
	
	void print()
	{
		System.out.println(this.c);
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		
		UsingThis x = new UsingThis();
		x.sum();
		x.print();
		
		
	}
	
	
	
	
	
	
	
	

}
