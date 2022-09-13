package defaultsandstatic;

public interface Test {
	public static void m1() {
		System.out.println("This is static method");
	}
	public default void m2() {
		System.out.println("This is Test method");
	}

}
