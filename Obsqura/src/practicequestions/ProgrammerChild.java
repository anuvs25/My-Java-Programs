package practicequestions;

public class ProgrammerChild extends EmployeeBaseClass{
	int basic;
	int da;
	int hra;
	public ProgrammerChild(int basic,int da,int hra) {
		this.basic=basic;
		this.da=da;
		this.hra=hra;
	}
	
	
	public void calculateSalary() {
		System.out.println("Programmer");
		System.out.println();
		int salary = basic+da+hra;
		System.out.println("Salary :"+salary);
	}

}
