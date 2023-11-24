package p2;

import p1.Protection;

public class SubClassInP2Package extends Protection{

	public SubClassInP2Package()
	{
		System.out.println("It is SubClassInP2Package class constructor");
	//	System.out.println("private_a :"+private_a);
		System.out.println("protected_b :"+protected_b);
	//	System.out.println("default_c :"+default_c);
		System.out.println("public_d :"+public_d);
		System.out.println("++++++++++++++++++++");
	}
}
