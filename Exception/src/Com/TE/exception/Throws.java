package Com.TE.exception;

public class Throws {
	public void m1() {
	try {
		m2(1);
	}
	catch(Exception e) {
		System.out.println("exception is handeled in m1");
	}
	}
	public void m2(int number)throws Exception{
		if(number==1)
			throw new Exception();
		else
			System.out.println(number);
	}
	public static void main(String[] args) {
		System.out.println("program starts");
		Throws t=new Throws();
		try {
			t.m1();
		}
		catch(Exception e) {
			System.out.println("exception handeled in main method");
		}
		System.out.println("program ends");
		}
	}
	

