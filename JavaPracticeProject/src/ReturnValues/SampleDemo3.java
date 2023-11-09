package ReturnValues;
class Demo3
{
	boolean isPrime(int num)
	{
		int flag = 0;
		boolean result = false;
		for(int i = 2;i < num;i++)
		{
			if(num % i == 0)
			{
				flag += i;
				break;
			}
		}
		if(flag == 0)
		{
			result = true;
		}
		return result;
	}
}
public class SampleDemo3 {

	public static void main(String[] args) {
		Demo3 O = new Demo3();
		boolean v1 = O.isPrime(31);
		System.out.println(v1);
		
		// Display Prime numbers in between 1 - 50.
		for(int i = 1;i <= 50;i++)
		{
			if(O.isPrime(i) == true)
			{
				System.out.println(i+" is a Prime Number.");
			}
		}
		System.out.println("---------------------");
		
		// Find Count of Prime in between 50 - 100.
		int count = 0;
		for(int i = 50;i <= 100;i++)
		{
			if(O.isPrime(i) == true)
			{
				count++;
			}
		}
		System.out.println("Count of Prime Numbers:"+count);
		System.out.println("-------------------------");
		
		// Display Sum of Prime Numbers in between 150 - 100.
		int sum = 0;
		for(int i = 150;i >= 100;i--)
		{
			if(O.isPrime(i) == true)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of Prime Numbers:"+sum);
		System.out.println("-------------------------");
	}
}