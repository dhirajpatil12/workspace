package defaultsandstatic;


public class Main implements Test{
	
	@Override
	public void m2() {
		System.out.println("the method is overidden");
	}

	public static void main(String[] args) {
		Test.m1();
		Main main=new Main();
		main.m2();
	}

}
