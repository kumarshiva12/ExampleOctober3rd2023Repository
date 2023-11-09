package ReturnValues;
class Demo2
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
public class SampleDemo2 {

	public static void main(String[] args) {
		Demo2 O = new Demo2();
		boolean v1 = O.isPrime(31);
		System.out.println(v1);
		boolean v2 = O.isPrime(25);
		System.out.println(v2);
	}
}