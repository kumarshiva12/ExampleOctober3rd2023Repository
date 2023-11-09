package Inheritance;
class OddEven
{
	void even(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+"is a Even Number");
		}
		else
		{
			System.out.println(num+"is a Odd number");
		}
	}
}

class CheckOdd extends OddEven
{
	void odd(int num)
	{
		if(num%2!=0)
		{
			System.out.println(num+"is a Odd Number");
		}
		else
		{
			System.out.println(num+"is a Even number");
		}
	}
}
class Maths3 extends OddEven
{
	void neu(int num)
	{
		if(num>0)
		{
			System.out.println(num+"is a Positive Number");
		}
		else
		{
			System.out.println(num+"is a Neg number");
		}
	}

	public static void main(String[] args) {
	CheckOdd o=new CheckOdd();
		o.odd(9);
		o.even(9);
		Maths3 o2=new Maths3();
		o2.neu(-2);
		o2.even(9);

	}

}



	