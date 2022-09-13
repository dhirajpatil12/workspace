package com.te.threadsynchronization;

public class tatkal {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(10);
		Irctc irctc=new Irctc();
		User ravi=new User("ravi",65,irctc);
		User darshan=new User("darshan",20,irctc);
		User amir=new User("amir",20,irctc);
		User dar=new User("dar",65,irctc);
		ravi.start();
		darshan.start();
		amir.start();
		dar.start();
		
		}

}
