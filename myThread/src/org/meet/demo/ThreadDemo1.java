package org.meet.demo;

public class ThreadDemo1 {
	public static void main(String[] args) {
		SubRunnable sr=new SubRunnable();
		Thread t=new Thread(sr);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
