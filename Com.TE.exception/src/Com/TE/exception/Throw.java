package Com.TE.exception;

public class Throw {
 public void m1() {
	 try {
		 m2();
	 }catch(Exception e) {
		 System.out.println("exception is handeled");
	 }
 }
 public void m2() {
	 try {
		 throw new RuntimeException();
		 }catch(Exception e) {
			 System.out.println("handeled in m2");
		 }
	 
 }
 public static void main(String[] args) {
	System.out.println("program start");
	new Throw().m2();
	System.out.println("program end");
}

}
