package com.te.mock;




public class Test1 {
	public static void main(String[] args) {
		String string="Dhiraj patil";
	    String revstring=" ";
		for(int i=string.length()-1;i>=0;i--) {
			revstring=revstring+string.charAt(i);
		
		}
		System.out.println(revstring);
		
	}
	
	
}