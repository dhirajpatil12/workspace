package Co.TE.upcasting;

public class Whatsapp {
	public static void main(String[]args) {
	User user=new User();
	user.name="pushpa";
	user.phonenumber=785566554455l;
	user.text();
	user.call();
	System.out.println("-----------");
	User user1=new Admin();
	user1.name="Rocky";
	user1.phonenumber=845758969l;
	user1.text();
	user1.call();
	
	Admin ad=(Admin)user1;
	ad.adduser("shrivalli");
	System.out.println(ad.name);
	
	}

}
