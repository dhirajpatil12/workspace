import java.util.Scanner;
public class test3 {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int a;
	a=scanner.nextInt();
	int b;
	b=scanner.nextInt();
	int res=0;
	int res1=0;
	try {
		res=a/b;
		System.out.println(res);
	}
	finally {
		System.out.println("task completed");
	}
	
	try {
		res1=b/a;
		System.out.println(res1);
	
	}
	catch(ArithmeticException e) {
		System.out.println("denominator is not valid");
		
	}
	
	scanner.close();
	
}

}
