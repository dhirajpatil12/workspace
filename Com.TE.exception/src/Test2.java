import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int a;
		a=scanner.nextInt();
		int b;
		b=scanner.nextInt();
		int res=0;
		try {
			res=a/b;
			int []x= {10,2,3,4,14,15};
			System.out.println(x[res]);
			System.out.println(res);
			
		}
		finally {
			System.out.println("connection closed");
			scanner.close();
		}
		
	
	
		
	}
}
