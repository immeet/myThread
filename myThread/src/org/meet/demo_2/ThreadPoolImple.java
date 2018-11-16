package org.meet.demo_2;

public class ThreadPoolImple implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"创建线程池...");
	}

}
