package com.te.thread;

public class BoyFriend {
	public static void main(String[] args) {
		GirlFriend girlFriend=new GirlFriend();
		Thread.currentThread().setName("Amir");
	    girlFriend.setName("Khushi");
	    girlFriend.start();
	    for(int i=0;i<5;i++) {
	    	System.out.println("hello....come soon");
	    	
	    }
	    try {
	    	girlFriend.join();
	    	
	    }
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	   System.out.println("she reached=========");
	   System.out.println("they go together to resturant");
	   System.out.println("they will have icecream");
	   System.out.println("and return back to their respective home");
	
	}
	

}
