package com.te.neww;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Tonique {
	List<String> brand = (List<String>) Arrays.asList("old monk", "oak smith gold", "signature", "teachers",
			"balentines","100 pipers");
	int quantity;
 

	public synchronized void boy(String name,int numberOfBottels) {
        	 Boolean b=brand.stream().anyMatch(x -> x.equals((String)name));
        	 
        	 if (b) {
        		 System.out.println("here is your brand"+name);
        		 System.out.println("here are your bottels,dont drunk and drive");
        		 quantity=numberOfBottels;
        	 } else {
        			 System.err.println("wait the stock will berefilled");
        			 try {
        				 this.wait();
        				 System.out.println("thanks for waiting and here is your drink");
        		 }catch(InterruptedException e) {
        			 e.printStackTrace();
        		 }
        	 }
        	 
         }

	public synchronized void refillstock(String name, int quality) {
		HashSet<String> hashSet = new HashSet<>(brand);
		hashSet.add(name);
		ArrayList<String> arrayList = new ArrayList<>(hashSet);
		brand = arrayList;
		this.quantity += quantity;
		this.notifyAll();
	}

}
