package interfacepractice;

public class InterfaceAnimalDog implements InterfaceAnimal{
	public void bark() {
		System.out.println("Dog is barking....");
	}

	public static void main(String[] args) {
		InterfaceAnimalDog dog = new InterfaceAnimalDog();
		dog.bark();

	}

}
