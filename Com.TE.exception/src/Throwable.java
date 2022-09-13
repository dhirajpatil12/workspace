
public class Throwable {
	public static void main(String[] args) {
		System.out.println("program start");
	
	try {
		throw new Exception();
	}
	catch(Exception e) {
		System.out.println("checked exception handled");
	}
	try {
		throw new RuntimeException();
	}
	catch(Exception e) {
		System.out.println("Exception handled");
		
	}
	System.out.println("program end");
	
	
}
}
