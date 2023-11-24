package p1;

public class SubClassInP1Package extends Protection{

	public SubClassInP1Package()
	{
		System.out.println("It is SubClassInP1Package class constructor");
	//	System.out.println("private_a :"+private_a);
		System.out.println("protected_b :"+protected_b);
		System.out.println("default_c :"+default_c);
		System.out.println("public_d :"+public_d);
		System.out.println("++++++++++++++++++++");
	}
}
