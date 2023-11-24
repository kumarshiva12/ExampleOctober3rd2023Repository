package p2;

import p1.Protection;

public class IndependnetClassInP2Package {
	Protection p=new Protection();
	public IndependnetClassInP2Package()
	{
		System.out.println("It is Protection class constructor");
	//	System.out.println("private_a :"+p.private_a);
	//	System.out.println("protected_b :"+p.protected_b);
	//	System.out.println("default_c :"+p.default_c);
		System.out.println("public_d :"+p.public_d);
		System.out.println("++++++++++++++++++++");
	}

}
