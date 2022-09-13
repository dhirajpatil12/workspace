package com.te.thread;

import com.te.neww.Tonique;

public class Supplier {
	Tonique tonique;
	String name;
	String brand;


	public Supplier(Tonique tonique, String name) {
		super();
		this.tonique = tonique;
		this.name = name;
		
	}
	public String getBrand() {
		return brand;
	}
     public void setBrand(String brand) {
    	 this.brand=brand;
     }
     public void run() {
    	 System.out.println("suppliers");
    	 tonique.refillstock(brand,100);
     }
	public void start() {
		// TODO Auto-generated method stub
		
	}
}
