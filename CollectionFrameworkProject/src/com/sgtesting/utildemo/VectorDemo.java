package com.sgtesting.utildemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElements2();
	//	readElementsByIterator();
	//	readElementsByEnumaration();
		withoutGenerics();
	}
	
	private static void addElements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Berry");
		obj.add("Mango");
		obj.add("Guava");
		System.out.println("Elements :"+obj);
		Vector<String> obj1=new Vector<String>();
		obj1.add("White");
		obj1.add("Blue");
		obj1.add("Green");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Berry");
		obj.add("Pineapple");
		obj.add("Guava");
		System.out.println("Elements :"+obj);
		obj.remove("Apple");
		System.out.println("Elements :"+obj);
		obj.remove(0);
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Berry");
		obj.add("Pineapple");
		obj.add("Guava");
		System.out.println("Elements :"+obj);
		for(String str:obj)
		{
			System.out.println(str);
		}
	}

	private static void readElements2()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Berry");
		obj.add("Pineapple");
		obj.add("Guava");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElementsByIterator()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Berry");
		obj.add("Pineapple");
		obj.add("Guava");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void readElementsByEnumaration()
	{
		Vector<String> obj=new Vector<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add(0,"Berry");
		obj.add("Pineapple");
		obj.add("Guava");
		System.out.println("Elements :"+obj);
		Enumeration<String> ite=obj.elements();
		while(ite.hasMoreElements())
		{
			System.out.println(ite.nextElement());
		}
	}
	
	private static void withoutGenerics()
	{
		Vector obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add(120);
		obj.add('Y');
		obj.add(800.125);
		obj.add(true);
		System.out.println("Elements :"+obj);
	}
}
