package practicequestions;

/*Write a Java program to create a class called Employee with private instance variables 
 * employee_id, employee_name, and employee_salary. Provide public getter and setter 
 * methods to access and modify the id and name variables, but provide a getter method 
 * for the salary variable that returns a formatted string.*/

public class EncapsulationEmployee {
	private String employee_id;
	private String employee_name;
	private double employee_salary;
	
	public void setter(String employee_id,String employee_name,double employee_salary) {
		this.employee_id=employee_id;
		this.employee_name=employee_name;
		this.employee_salary=employee_salary;
	}
	
	public void getter() {
		System.out.println("Employee Salary Details");
		System.out.println();
		System.out.println("Employee ID	: " +employee_id);
		System.out.println("Employee Name	: " +employee_name);
		System.out.println("Employee Salary	: " +"Rs."+employee_salary);
	}
}
