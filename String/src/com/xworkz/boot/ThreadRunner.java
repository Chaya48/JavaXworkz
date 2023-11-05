package com.xworkz.boot;

public class ThreadRunner {

	public static void main(String[] args) {

		Thread thread=new Thread();
		 int ref=thread.getPriority();
		 System.out.println(ref);
		long ref1=thread.getId();
		System.out.println(ref1);
		String ref2 = thread.getName();
		System.out.println(ref2);
		StackTraceElement[] ref3 = thread.getStackTrace();
		System.out.println(ref3);
		boolean ref5=thread.interrupted();
		System.out.println(ref5);
		int ref6=thread.MIN_PRIORITY;
		System.out.println(ref6);
		int ref7=thread.activeCount();
		System.out.println(ref7);
		int ref8=thread.enumerate(null);
		System.out.println(ref8);
		int ref9=thread.activeCount();
		System.out.println(ref9);
	}

}
