package com.te.thread;

import com.te.neww.Tonique;

public class Customer extends Thread{
	Tonique tonique;
	String name;
	String brand;
	
	public Customer(Tonique tonique, String name, String brand) {
		super();
		this.tonique = tonique;
		this.name = name;
		this.brand = brand;
	}

	@Override
	public void run() {
		tonique.boy(brand,2);
	}
}
