package Com.TE.CustomException;

public class Election {
	public void vote(int age) {
		if(age<18) {
			try {
				throw new NotEligibleException("voter age is less for voting");
			}catch(NotEligibleException e) {
				System.out.println(e.getMessage());
			}
		}
		else
			System.out.println("casted vote successfully");
	}
	public static void main(String[] args) {
		Voter voter =new Voter(1,"Amit",22);
		Voter voter2=new Voter(2,"Bhagwat",20);
		
		Election election =new Election();
		election.vote(voter.getId());
		election.vote(voter.getage());
		
	}
}



