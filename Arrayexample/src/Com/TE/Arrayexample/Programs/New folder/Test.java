package com.te.designpatterns;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int b[]=new int[4];
		b[0]=a.nextInt();
	   b[1]=a.nextInt();
	    b[2]=a.nextInt();
	     b[3]=a.nextInt();

		int Large=0;
	
				for(int i=0;i<=b.length-1;i++) {
					for(int j=i+1;j<=b.length-1;j++) {
						if(b[i]>=b[j]) {
							b[j]=b[i];
							Large=b[j];
							System.out.println(Large);
						
						
					
					
					
				}
			
				
		}
		
			}
		
	}
		
	
}
	