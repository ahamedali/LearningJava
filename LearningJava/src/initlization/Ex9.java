package initlization;

public class Ex9 {
	
	Ex9(int i)
	{
		System.out.println(i);
	}
	
	Ex9(boolean x)
	{
		System.out.println(x);	
	}
	
	Ex9 ref;

	public static void main(String[] args) {
		
		Ex9 obj = new Ex9(0);
		System.out.println(obj.ref);

	}

}
