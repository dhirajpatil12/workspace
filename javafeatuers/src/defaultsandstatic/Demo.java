package defaultsandstatic;


public class Demo implements Test,Ambigious {
	public void m2() {
		System.out.println("This is Demo's method");;
	}
	
	
	
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.m2();
		
	}


}
