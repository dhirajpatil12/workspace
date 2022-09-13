package com.te.methodreferance;

public class Main {
	public void test() {
		System.out.println("namaskar!kasa kay");
	}
	public void demo() {
		System.out.println("tata!phir milte he");
	}
	public static void main(String[] args) {
		Main main=new Main();
		Test t=main::test;
		t.m2();
		Test t1=main::demo;
		t1.m2();
	}

}




