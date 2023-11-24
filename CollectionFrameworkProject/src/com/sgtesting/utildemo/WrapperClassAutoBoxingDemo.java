package com.sgtesting.utildemo;
public class WrapperClassAutoBoxingDemo {
	public static void main(String[] args) {
		autoBoxing();
	}
	private static void autoBoxing()
	{
		int a=35;
		System.out.println("int a :"+a);
		//Convert it into wrapper class object
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b:"+b);
		//Autoboxingc
		Integer c=a;
		System.out.println("Integer c :"+c);
	}

}
