package com.te.thread;

import javax.management.RuntimeErrorException;

public class Test extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getPriority());
        for(int i=11;i<=20;i++) {
        	if(i==14) {
        		throw new RuntimeException()
        	}
        	try {
        		Thread.sleep(1000);
        	}catch (InterruptedException e)
        	{
        		e.printStackTrace();
        	}
        
			System.out.println(i+"==user2");
		}
	}
	public static void main(String[] args)throws InterruptedException {
		Test test=new Test();
		thread.start();
		thread.setName("jon");
		thread.setPriority
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+"==user1");
			

			
		}
	}
   
}
       