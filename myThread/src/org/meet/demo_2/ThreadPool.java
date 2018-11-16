package org.meet.demo_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * JDK1.5新特性  线程池
 * 使用工厂类Executors中的静态方法创建线程对象，指定线程的个数
 */
public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.submit(new ThreadPoolImple());
		es.submit(new ThreadPoolImple());
		es.submit(new ThreadPoolImple());
	}
}
