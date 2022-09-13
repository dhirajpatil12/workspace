package com.te.thread;

public class Thread1 {
	public static void main(String[] args) {
		Thread thread=new Thread(new Mythread());
		Thread thread2=new Thread(new Mythread());
		thread.start();
		thread2.start();
		
		
		
		
		
	}

}
