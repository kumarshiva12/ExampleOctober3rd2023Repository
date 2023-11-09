package ReturnValues;
class Sample
{
	char[] ch(char a[][])
	{
		char[] res = new char[a.length ];
		int k = 0;
		for (int i = 0;i < a.length;i++)
		{
			res[k] = a[0][i];
			k++;
		}
		return res;
	}
}
public class CharArrayFirstRaw {

	public static void main(String[] args) {
		// Char Array read the First Raw
		Sample O = new Sample();
		char x[][] = {{ 'A', 'B', 'C' },{ 'D', 'E', 'F' },{ 'G', 'H', 'I' }};
		char z[] = O.ch(x);
		for (int i = 0; i < z.length; i++)
		{
			System.out.print(z[i]+ " ");
		}
	}
}