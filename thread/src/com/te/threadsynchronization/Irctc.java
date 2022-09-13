package com.te.threadsynchronization;

public class Irctc {
     int noOfTickets=100;
     public synchronized void bookTickets(int tickets,String name) {
    	 System.out.println("welcome to irctc"+" "+name);
    	 System.out.println("how can i help you ");
    	 if(noOfTickets>tickets) {
    		 noOfTickets=tickets;
    		 System.out.println("thankyou for booking"+tickets+"tickets.enjoy  your ride"+name);
    	 }
    	 else
    	 {
    		 System.out.println("sorry you are late ");
    		 return;
    	 }
    	 System.out.println("no of tickets left"+noOfTickets);
     }
}
