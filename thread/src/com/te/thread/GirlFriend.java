package com.te.thread;

public class GirlFriend extends Thread{
		
		
	

	@Override
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("i am on my way ...hold"+Thread.currentThread());
	}
	
        
}
}