
public class Voter {
	private int age;
	private String name;
	private int id;
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		if (age>18) {
		this.age=age;
			System.out.println("you are eligible"+this.name);
		}
		else {
				System.out.println("you are not eligible"+this.name);
			}
			
		}
		
	}
	

