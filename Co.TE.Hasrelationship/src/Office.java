

public class Office {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name="dhiraj";
		employee.contactno=245446544l;
	    employee.id=2025;
		Address address=new Address();
		address.buildingno=7;
		address.landmark="My house";
		address.pincode=421306;
		
		employee.address=address;
		
		System.out.println(employee.name);
		System.out.println(employee.contactno);
		System.out.println(employee.id);
		System.out.println(employee.address.buildingno)
		;
		System.out.println(employee.address.landmark);
		System.out.println(employee.address.pincode);
	}
	

}
