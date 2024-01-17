package exceptionpractice;

public class ThrowsExceptionSample {
	
	public void votingEligibility(int age) throws VotingEligible {
		if(age<18 ) {
			throw new VotingEligible("Not eligible for licence");
		}
		else {
			System.out.println("Eligible for licence");
		}
	}

	public static void main(String[] args) {
		ThrowsExceptionSample ob = new ThrowsExceptionSample();
		try {
		ob.votingEligibility(15);
		}
		catch(VotingEligible e){
			System.out.println(e);
		}

	}

}
