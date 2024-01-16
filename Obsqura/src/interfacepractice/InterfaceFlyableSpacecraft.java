package interfacepractice;

public class InterfaceFlyableSpacecraft implements InterfaceFlyable {
	public void fly_obj() {
		System.out.println("The space craft has a speed of "+speed);
	}

	public static void main(String[] args) {
		InterfaceFlyableSpacecraft spacecraft = new InterfaceFlyableSpacecraft();
		spacecraft.fly_obj();

	}

}
