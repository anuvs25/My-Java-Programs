package practicequestions;

/*Write a Java program to create a class Employee with a method called calculateSalary(). 
Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method 
to calculate and return the salary based on their specific roles.*/

public class PolymorphismQuestFour {

	public static void main(String[] args) {
		ManagerChild manager = new ManagerChild(30000,4500,2500);
		manager.calculateSalary();
		ProgrammerChild programmer = new ProgrammerChild(30000,4500,2500);
		programmer.calculateSalary();
	}

}
