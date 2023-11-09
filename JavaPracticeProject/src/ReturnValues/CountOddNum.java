package ReturnValues;
class Demoy
{
	int count(int a, int b)
	{	
		int count = 0;
		for(int i = a;i <= b;i++)
		{
			if(i % 2 != 0)
			{
				count++;
			}
		}
		return count;
	}
}
public class CountOddNum {

	public static void main(String[] args) {
		// Count Odd Numbers in between 150 to 250
		Demoy O = new Demoy();
		int ct = O.count(150,250);
		System.out.println("Total count = "+ct);
	}
}