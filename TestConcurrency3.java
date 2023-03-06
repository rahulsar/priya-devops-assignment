package com.ssc.wipro;

import static java.lang.System.out;
public class TestConcurrency3 extends Thread {

	public static void main(String[] args) {
		ConcurrentObject objRef = ConcurrentObject.getThreadFactory(new UniqueThreadFactory());
		objRef.execute(new Runnable()){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		}
	objRef.shutDown();
	}

	/*public static void main(String... args) {
		TestConcurrency3 t3 = new TestConcurrency3();
		t3.start();
		value++;
		TestConcurrency3 t = new TestConcurrency3();
		t.start();
	}
	private static int value = 37;
	//TestConcurrency3(){value = 27;}
	public void run(){
		//synchronized(value){
			value ++;
			System.out.print(value);
		//}			
	}*/
	//String text = "Hello, world!";
	//int m = 7;
	
	
	
}
