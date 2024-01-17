package exceptionpractice;

public class ThrowExceptionSample {
	
	public void votingEligibility(int age) {
		if (age<18) {
			//System.out.println("Not eligible for voting");
			throw new ArithmeticException("Not eligible");
		}
		else {
			System.out.println("Eligible for voting");
		}
	}

	public static void main(String[] args) {
	
		ThrowExceptionSample ob = new ThrowExceptionSample();
		ob.votingEligibility(15);

	}

}
