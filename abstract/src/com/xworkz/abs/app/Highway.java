package com.xworkz.abs.app;

public abstract class Highway {

	public void travel() {
		System.out.println("invoking travel in highway");
	}

	public void running() {
		System.out.println("invoking running in highway");
	}

	public void walking() {
		System.out.println("invoking walking in highway");
	}

	public void distance() {
		System.out.println("invoking distance in highway");
	}

	public void type() {
		System.out.println("invoking type in highway");
	}

	public abstract void code();

	public abstract void system();

	public abstract void patrol();

	public abstract void highwayman();

	public abstract void signal();
}
