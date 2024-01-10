package abstractionexample;

public class AbstractClassOneSample extends AbstractClassSample {
	public void animalsound() {
		System.out.println("Barks : ");
	}

	public static void main(String[] args) {
		AbstractClassOneSample ob = new AbstractClassOneSample();
		ob.animalsound();
		ob.animal("Dog");

	}

}
