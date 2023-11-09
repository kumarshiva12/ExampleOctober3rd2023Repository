package ReturnValues;
class Demo
{
	int sum1(int num)
	{
		int sum = 0;
		for (int i = 1; i <= num; i++)
		{	
			sum = sum + i;
		}
		return sum;
	}
}
public class SumofNums {

	public static void main(String[] args) {
		// Sum of Numbers from 1 to 20.
		Demo O = new Demo();
		int a = O.sum1(25);
		System.out.println("sum = "+a);
	}
}