package practicequestions;

/* Write a Java program to create a class called Person with private instance variables name,
 *  age. and country. Provide public getter and setter methods to access and modify these 
 *  variables.*/

public class EncapsulationPerson {
	private String name;
	private int age;
	private String country;
	
	public void setter(String name,int age,String country) {
		this.name=name;
		this.age=age;
		this.country=country;
	}
	
	public void getter() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(country);
	}

}
