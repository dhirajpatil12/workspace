package Co.TE.Inheritance;

public class Smartphone extends Phone {
	int ram;
	int camera;
	public Smartphone() {
		super("abcd",123,"agecg");
		
	}
	public Smartphone(String name,double price,String color,int ram,int camera )
	super (name,price,color);
	this.ram=ram;
	this.camera=camera;
}
public void browse() {
	System.out.println("browsing");
public void videocall() {
	System.out.println("calling"+name);
}
public void play(String name) {
	System.out.println("play"+name);
}
public void game(String name) {
	System.out.println("play BGMI");
}
public void videocall(String name) {
	System.out.println(""");
}
	
	

}
