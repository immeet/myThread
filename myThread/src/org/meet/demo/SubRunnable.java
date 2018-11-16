package org.meet.demo;

public class SubRunnable implements Runnable{
	private int count=0;
	@Override
	public void run() {
		while(count<100){
			count++;
			if(count%2==0){
				System.out.println("count="+count);
			}
		}
	}
}
