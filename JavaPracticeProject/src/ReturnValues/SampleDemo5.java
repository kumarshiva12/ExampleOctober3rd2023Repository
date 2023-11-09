package ReturnValues;
class Demo5
{
	int Addition(int x,int y)
	{
		return (x + y);
	}
	int Substraction(int x,int y)
	{
		int res = (x - y);
		return res;
	}
	void Multiplication(int x,int y)
	{
		int res = (x * y);
		System.out.println("Multiplication:"+res);
	}
}
public class SampleDemo5 {

	public static void main(String[] args) {
		Demo5 O = new Demo5();
		O.Multiplication(O.Addition(40,50), O.Substraction(30,15));
	}
}