package com.sgtesting.utildemo;
class Sample
{
	public static <E> void readElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}
public class GenericsElementLevelDemo {
	public static void main(String[] args) {
		Integer a[]= {10,20,30,40,50};
		Sample.readElements(a);
		System.out.println("+++++++++++++");
		String s[]= {"Mango","Orange","Apple"};
		Sample.readElements(s);
		System.out.println("+++++++++++++");
		Double d[]= {1.1,2.2,3.3,4.4};
		Sample.readElements(d);
		System.out.println("+++++++++++++");
	}

}
