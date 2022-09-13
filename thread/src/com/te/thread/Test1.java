package com.te.thread;

import com.te.neww.Tonique;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		Tonique tonique =new Tonique();
		Customer bhagu=new  Customer(tonique,"bhagwat","signature");
		Customer mohit=new Customer(tonique,"mohit","oak smith gold");
		Customer vinyak=new Customer(tonique,"vinyak","100 pipers");
		bhagu.start();
		mohit.start();
		vinyak.start();
		Supplier dheeraj=new Supplier(tonique,"dheeraj");
		dheeraj.setBrand("100 pipers");
		Thread.sleep(1000);
		dheeraj.start();
		
		
		
	}

}
