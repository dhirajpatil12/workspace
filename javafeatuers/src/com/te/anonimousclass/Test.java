package com.te.anonimousclass;


public class Test {
	public static void main(String[] args) {
		System.out.println("program start");
		Runnable r=new Runnable() {
			
		
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(i);
				}
			}
	};
	r.run();
	System.out.println("This is from lambda expression");
	//lambda expression
	Runnable r1=()->{
		for(int i=11;i<15;i++) {
			System.out.println(i);
		}
	};
	r1.run();
	
	System.out.println("program ends");
		
		
		
	}

}
