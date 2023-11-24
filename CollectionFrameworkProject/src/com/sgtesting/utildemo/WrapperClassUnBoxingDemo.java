package com.sgtesting.utildemo;
public class WrapperClassUnBoxingDemo {
	public static void main(String[] args) {
		unBoxingDemo();
	}
	
	private static void unBoxingDemo()
	{
		Integer a=Integer.valueOf(45);
		System.out.println("Integer a:"+a);
		//Convert to primitive value
		int b=a.intValue();
		System.out.println("int b:"+b);
		// Unboxing
		int c=a;
		System.out.println("int c :"+c);
	}

}
