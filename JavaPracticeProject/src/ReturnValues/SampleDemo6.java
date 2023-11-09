package ReturnValues;
class Demo6
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
	void Multiplication()
	{
		int a = this.Addition(50, 30);
		int b = this.Substraction(30, 15);
		int res = (a * b);
		System.out.println("Multiplication:"+res);
	}
}
public class SampleDemo6 {

	public static void main(String[] args) {
		Demo6 O = new Demo6();
		O.Multiplication();
	}
}