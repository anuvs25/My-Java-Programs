package exceptionpractice;

public class ThrowsExceptionSampletwo {
	
	public void esiEligibility(int basic) throws EsiEligible {
		if(basic>5000&&basic<=20000) {
			System.out.println("ESI applicable");
		}else {
			//System.out.println("ESI not applicable");
			throw new EsiEligible("ESI not applicable");
		}
	}

	public static void main(String[] args) throws EsiEligible {
		ThrowsExceptionSampletwo ob = new ThrowsExceptionSampletwo();
		ob.esiEligibility(25000);
	}

}
