package ReturnValues;

class StringDemo{
	String arr(String  s[][])
	{
		String str = " ";
		for(int i = 0;i < s.length;i++)
		{
			for(int j = 0; j < s[i].length;j++)
			{
				str = str + s[i][j];
			}
		}
		return str;
	}
}

public class StringArrayCont {

	public static void main(String[] args) {
		// String Array concatenate 
		StringDemo O = new StringDemo();
		String s[][]= {{"One","Two","Three"},{"Four","Five","Six"},{"Seven","Eight","Nine"}};
		String a = O.arr(s);
		System.out.println(a);
	}
}