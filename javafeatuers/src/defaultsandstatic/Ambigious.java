package defaultsandstatic;

public interface Ambigious {
	public default void m2() {
		System.out.println("This is ambigous method");
	}

}
