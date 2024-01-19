package practiceset;

/* write a java program to get the details of a student 
class 1 student 
Get the student's name and roll number 
class 2 address 
get the address of the student 
print the students name and roll number with the address 
there is no is a relationship*/

public class StudentPractice {
String name;
int roll_no;

public StudentPractice(String name,int roll_no) {
	this.name=name;
	this.roll_no=roll_no;
	System.out.println("Name: "+name);
	System.out.println("Roll No: "+roll_no);
	
}
}
