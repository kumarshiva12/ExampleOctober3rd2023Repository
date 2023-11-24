package p1;

public class Protection {
	
	private int private_a=100;
	protected int protected_b=200;
	int default_c=300;
	public int public_d=400;
	
	public Protection()
	{
		System.out.println("It is Protection class constructor");
		System.out.println("private_a :"+private_a);
		System.out.println("protected_b :"+protected_b);
		System.out.println("default_c :"+default_c);
		System.out.println("public_d :"+public_d);
		System.out.println("++++++++++++++++++++");
	}
}
