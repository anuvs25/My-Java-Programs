package encapsulationpractice;

/*Write a Java program to create a class called Car with private instance variables 
 * company_name, model_name, year, and mileage. Provide public getter and setter methods 
 * to access and modify the company_name, model_name, and year variables. 
 * However, only provide a getter method for the mileage variable.*/

public class EncapCar {
	private String company_name;
	private String model_name;
	private int year;
	private double mileage;
	
	public void setter(String company_name,String model_name,int year,double mileage) {
		this.company_name=company_name;
		this.model_name=model_name;
		this.year=year;
		this.mileage=mileage;
	}
	
	public void getter() {
		System.out.println(mileage);
	}

}
