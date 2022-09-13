package Com.TE.Arrayexample;



public class Fibonaaci {
	public static void main(String[] args) {
       int a=0;
       int b=1;
       int c=10;
       int d=0;
       System.out.print("Elements ="+a+b);
       for(int i=2;i<c;i++)
       {
    	   d=a+b;
    	   System.out.print(d);
    	   a=b;
    	   b=d;
       }
       
       }
     
}
	