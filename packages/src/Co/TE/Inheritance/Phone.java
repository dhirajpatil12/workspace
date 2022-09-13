package Co.TE.Inheritance;

public class Phone {
	String name;
	double price;
	String color;
	 public Phone(String name,double price,String color)
	 super();
	 this.name=name;
	 this.price=price;
	 this.color=color;
	 
}

public void call(String name) {
	System.out.println("calling"+name);

}

public void text(String name,String msg)
{
	System.out.println("sending text to"+name);
}