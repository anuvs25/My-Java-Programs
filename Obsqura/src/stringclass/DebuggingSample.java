package stringclass;

public class DebuggingSample {
	public void add() {
		int a =10;
		int b = 20;
		System.out.println("The sum is "+(a+b));
	}
	
	public void studentDetails() {
		String std_name = "Anup";
		String std_course = "M Tech";
		System.out.println(std_name+std_course);
	}
	
	public void employeeDetails() {
		String emp_name = "Anup";
		int sal = 20000;
		System.out.println("The employee name is "+emp_name+ " and salary is "+sal);
	}

	public static void main(String[] args) {
		DebuggingSample obj = new DebuggingSample();
		obj.add();
		obj.studentDetails();
		obj.employeeDetails();
	}

}
