package Inheritance;
class Large{
	void largetwo(int num1,int num2) {
		if(num1>num2) {
			System.out.println(num1+" is a greater number");
		}
		else if(num2>num1) {
			System.out.println(num2+" is a greater number");
		}
		else {
			System.out.println("Both are equal");
		}
	}
}
class Big extends Large{
	void largethree(int num1,int num2,int num3){
		   if((num1>num2)&& (num1>num3))
	        {
	        	System.out.println(num1+" is a greater number");
	        }
	        else if((num2>num1)&& (num2>num3)) {
	        	System.out.println(num2+" is a greater number");
	        }
	        else {
	        	System.out.println(num3+" is a greater number");
	        }
	}
}
class Alpha extends Big{
	void vowel(char ch) {
		if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') ||(ch=='u') || 
				(ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') ||(ch=='U'))
			
		{
			System.out.println(ch+" is a vowel");
		
		}
		else {
			System.out.println(ch+" is not a vowel");
		}
	}
	
	public static void main(String[] args) {
		Alpha o=new Alpha();
		o.vowel('o');
		o.largethree(98, 90, 76);
		o.largetwo(65, 76);
		
	}

}

public class MultilevelInheritancedemo {

	public static void main(String[] args) {
		

	}

}
