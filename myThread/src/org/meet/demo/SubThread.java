package org.meet.demo;
/**
 * 
 * @author KarlChu
 *用extends Thread创建一个线程
 *打印1~100以内的偶数
 */
public class SubThread extends Thread{
	private int count=0;
	public void run(){
		while(count<100){
			count++;
			if(count%2==0){
				System.out.println("count="+count);
			}
		}
		System.out.println(getName());
	}
}
