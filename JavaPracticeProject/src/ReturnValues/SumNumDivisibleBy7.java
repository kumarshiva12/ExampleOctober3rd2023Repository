package ReturnValues;
class Demov
{
	int Sum2(int a, int b)
	{
		int sum = 0;
		for (int i = a;i <= b;i++)
		{
			if (i % 7 == 0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
}
public class SumNumDivisibleBy7 {

	public static void main(String[] args) {
		// Sum of Numbers Divisible By 7 in between 100 to 200.
		Demov O = new Demov();
		int sum = O.Sum2(100, 200);
		System.out.println("Total sum = "+sum);
	}
}