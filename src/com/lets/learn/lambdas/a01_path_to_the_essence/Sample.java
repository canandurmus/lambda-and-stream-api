package com.lets.learn.lambdas.a01_path_to_the_essence;

public class Sample {
	
	//print a message from another thread
	public static void main(String[] args) {
	
		Thread th = new Thread (new Runnable() {
			
			public void run() {
				System.out.println("In another thread");
				
			}
		});
		 
		th.start();
		
		
		Thread th2 = new Thread(() -> System.out.println());
		th2.start();
		
		
		System.out.println("In main");
	}
}