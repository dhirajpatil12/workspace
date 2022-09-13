package com.te.phoneSimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Contactlist>aa=new ArrayList<Contactlist>();
		Contactlist user = new Contactlist("anil", 1234567891l);
		aa.add(user);
		Contactlist user1 = new Contactlist("Dhiraj", 1234567892l);
		aa.add(user1);
		Contactlist user2=new Contactlist("amit",7845969541l);
		aa.add(user2);
		
    	  
    	  Scanner scanner = new Scanner(System.in);
    	  System.out.println("Enter number 1 to get contact no,name & press 2 to get info by name:");
    	  int press=scanner.nextInt();
    	 
		
		 int button=press;
		switch (button) {
		case 1:System.out.println(user);
		       System.out.println(user1);
		       System.out.println(user2);
		break;
		case 2:
			String cname = scanner.next();
			List<Contactlist> collect = aa.stream().filter(t->t.getContactName().equalsIgnoreCase(cname)).collect(Collectors.toList());
			Contactlist contactlist = collect.get(0);
			System.out.println(contactlist);
			
			
			
			
			
			
		break;
		case 3:
		break;
	
		
		default:
			break;
		}
		

		 
		 }

}
