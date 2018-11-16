package org.meet.demo_1;
//注释test
public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<5;i++){
			Thread.sleep(1000);
			System.out.println(i);
		}
	}
}
