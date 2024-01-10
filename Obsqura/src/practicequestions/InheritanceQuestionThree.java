package practicequestions;
/*Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager 
by making an object of both of these classes and print the same.*/
class Member{
	String name = "Aarav";
	int age = 29;
	double mob = 2357;
	String address = "Trivandrum, Kerala";
	int salary = 25000;
	
	/*String name ;
	int age;
	double mob;
	String address ;
	int salary;*/
	
	public void printSalary() {
		System.out.println("The salary of the employee "+ name +" is "+salary);
	}
}
class Employee extends Member{
	String specialization = "Data Base support";
}

class Manager extends Member{
	String department = "Implementation";
}

public class InheritanceQuestionThree {

	public static void main(String[] args) {
		Employee ob = new Employee();
		ob.printSalary();
		System.out.println("The employee "+ob.name+" is specialized in "+ob.specialization);
		Manager ob1 = new Manager();
		System.out.println("The employee "+ob1.name+" is in "+ob1.department+" department");
	}

}
