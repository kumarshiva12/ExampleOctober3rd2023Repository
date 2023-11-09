package Inheritance;
class Count1{
	void count1(int i) {
	int count=0;
	for( i=250;i<=500;i++)
	{
		if(i%10==0)
		{
			count=count+1;
		}
	}
	System.out.println(count);
	System.out.println("++++++++++++++++++++++++++++++++++++++++");
}
}
class Cube1 extends Count1{
void cube1(int i) {
		
		int cube;
		cube=(i*i*i);
		System.out.println("cube"+cube);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}   
}
class Fact1 extends Cube1{
	void fact1(int num) {
		int i;
		int fact=1;
		for(i=1;i<=num;i++)
		{
				fact=fact*i;
		}
		System.out.println(fact);
		System.out.println("++++++++++++++++++++++++++++++++++");
	}
}
class Squ1 extends Count1{
	void squ1(int i) {
		 i=100;
		while(i<=200) {
			if(i%4==0) 
			{
				System.out.println(i);
			}
			i++;
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
	}

	public static void main(String[] args) {
		Fact1 o=new Fact1();
		o.fact1(5);
		o.cube1(4);
		o.count1(8);
		Squ1 o1=new Squ1();
		o1.squ1(76);
		o1.count1(9);

	}

}


