package Co.TE.Object;

public class Test implements Cloneable {
	String name;
		String s="Vinyak";
		String s1="Vinya";
		String string=new String("Vinyak");
		String string2=new String ("Vinya");
		System.out.println(string.equals(string2));
		System.out.println(s.equals(s1));
		
		
		
		Test test=new Test();
		
		Test test2=new Test();
		System.out.println("---------------------------");
		
		test.name="Amit";
	    
	
		boolean equals=test.equals(t2);
		System.out.println(equals);
		
		Test clone=(Test)test.clone();
		
		test=null;
		System.gc();
	
		
		System.out.println(clone.hashCode());
		System.out.println(test.hashCode());
		System.out.println(clone.name);
		System.out.println(test.getClass());
		
		System.out.println(test.hashCode());
		System.out.println(test2.hashCode());
		
	}

}
