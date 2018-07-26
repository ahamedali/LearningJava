package initlization;

public class Flower {
	int petalCount = 0;
	String s = "initial value";
	
	Flower(int petals){
		petalCount = petals;
		System.out.println("Con" + petalCount);
	}
	
	Flower(String ss)
	{
		System.out.println("s" + ss);
	}
	
	Flower(String s, int petals)
	{
		this(petals);
		this.s = s;
		System.out.println("S & I");
	}
	
	Flower()
	{
		this("hi",47);
		System.out.println("no arg");
	}
	
	void printPetalCount()
	{
		System.out.println(petalCount + s);
	}

	public static void main(String[] args) {
		Flower x= new Flower();
		x.printPetalCount();
		// TODO Auto-generated method stub

	}

}
