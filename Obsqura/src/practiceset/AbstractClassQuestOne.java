package practiceset;

public class AbstractClassQuestOne {

	public static void main(String[] args) {
		AbstractClassHawk hawk = new AbstractClassHawk();
		hawk.fly();
		hawk.makeSound();
		
		AbstractClassEagle eagle = new AbstractClassEagle();
		eagle.fly();
		eagle.makeSound();
	}

}
