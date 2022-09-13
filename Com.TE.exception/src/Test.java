import java.util.Scanner;

public class Test {
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
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The number you are accessing is not present");
		}
			catch(Exception e)
			{
				System.out.println("the deiminator entered is not valid");
				
			}
		try {
			res1=b/a;
			System.out.println(res1);
		}
		catch(ArithmeticException e)
		{
		System.out.println("the number you are accessing is not valid");
		}
	
		System.out.println(res);
		scanner.close();
		
	}
}
