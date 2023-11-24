package com.sgtesting.utildemo;
class MyClass<T>
{
	T obj;
	public void add(T obj)
	{
		this.obj=obj;
	}
	
	public T get()
	{
		return obj;
	}
}
public class GenericsDemo1 {
	public static void main(String[] args) {
		//With Generics
		MyClass<Integer> o1=new MyClass<Integer>();
		o1.add(100);
		int a=o1.get();
		System.out.println(a);
		o1.add(200);
		int b=o1.get();
		System.out.println(b);
		System.out.println("++++++++++++++++++++++++++");
		//Without Generics
		MyClass o2=new MyClass();
		o2.add("Mango");
		String s1=(String) o2.get();
		System.out.println(s1);
		o2.add(true);
		boolean b1=(boolean) o2.get();
		System.out.println(b1);
	}

}
