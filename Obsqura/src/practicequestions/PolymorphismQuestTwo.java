package practicequestions;

/*Write a Java program to create a class Vehicle with a method called speedUp(). 
Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.*/


public class PolymorphismQuestTwo {

	public static void main(String[] args) {
		Car ob = new Car();
		Bicycle ob1 = new Bicycle();
		ob.speedUp();
		ob1.speedUp();

	}

}
