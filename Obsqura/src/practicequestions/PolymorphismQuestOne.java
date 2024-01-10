package practicequestions;

/*Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
*/

public class PolymorphismQuestOne {

	public static void main(String[] args) {
		Cat ob = new Cat();
		Bird ob1 = new Bird();
		ob.sound();
		ob1.sound();

	}

}
