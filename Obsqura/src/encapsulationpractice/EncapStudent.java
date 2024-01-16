package encapsulationpractice;

/*Write a Java program to create a class called Student with private instance variables 
 * student_id, student_name, and grades. Provide public getter and setter methods to 
 * access and modify the student_id and student_name variables. However, provide a 
 * method called addGrade() that allows adding a grade to the grades variable while 
 * performing additional validation.*/
public class EncapStudent {
	private int student_id;
	private String student_name;
	private char grade;
	
	public void setter(int student_id,String student_name,char grade) {
	this.student_id=student_id;
	this.student_name=student_name;
	this.grade=grade;
	}
	
	public void getter() {
		System.out.println(student_id);
		System.out.println(student_name);
		System.out.println(grade);
	}
	public void addGrade(int a, int b ,int c) {
		int tot =(a+b+c);
		System.out.println("Total marks: "+tot);
	}

}
