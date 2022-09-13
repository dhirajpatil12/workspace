package Co.TE.Hasrelationshipeg;

import java.util.Scanner;

public class Office {
	 static Address address;
	 static Address address1;
	static Address address2;
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);  
		int nextInt = scanner.nextInt();
		System.out.println(nextInt);
		
		Employee employee = new Employee();
	    employee.Contactno=1234567890l;
	    employee.Id=12456;
	    employee.Name="Ram";
	    //======================
	    address=new A
	    		ddress();
	    employee.address=address;
	    employee.address.buildingno=10;
		employee.address.landmark="ideal collage";
		employee.address.pincode=421001;
		address1=new Address();
		employee.address=address1;
		employee.address.buildingno=12;
		employee.address.landmark="raj palace";
		employee.address.pincode=300111;
		address2=new Address();
		employee.address=address2;
		address2.buildingno=14;
		address2.landmark="king circle";
		address2.pincode=100212;
		
		
		switch (nextInt) {
		case 1: {
			
			address.getaddress();
			break;
		}
		case 2: {
			
			address1.getaddress();
			break;
		}
		case 3: {
			
			address2.getaddress();
		}
		default:{
			System.out.println("Address not present");
		}

		}		
					
			
		}

}
