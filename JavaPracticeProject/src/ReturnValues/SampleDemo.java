package ReturnValues;
class Demo1 {
	String getName()
	{
		String s = "Ganesh";
		return s;
	}
	int getAge()
	{
		int age = 21;
		return age;
	}
	String[] getHobbies(String hobbies[])
	{
		return hobbies;
	}
}


public class SampleDemo {

	private static final String O = null;

	public static void main(String[] args) {
		Demo1 o= new Demo1();
		String S1 = o.getName();
		System.out.println(S1);
		int a = o.getAge();
		System.out.println(a);
		String Str[] = {"reading","programming"};
		String S2[] = o.getHobbies(Str);
		
		for(String kk : S2);
		{
			String kk = null;
			System.out.println(kk+" ");
		}
		}
		
		
		
		
		

	}


