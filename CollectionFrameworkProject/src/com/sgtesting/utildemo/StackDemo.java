package com.sgtesting.utildemo;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		pushDemo(st, 100);
		pushDemo(st, 200);
		pushDemo(st, 300);
		pushDemo(st, 400);
		pushDemo(st, 500);
		popDemo(st);
	}
	
	private static void pushDemo(Stack<Integer> st,int a)
	{
		st.push(a);
		System.out.println("Element :"+a);
	}
	
	private static void popDemo(Stack<Integer> st)
	{
		int a=st.pop();
		System.out.println("Removed Element :"+a);
	}

}
