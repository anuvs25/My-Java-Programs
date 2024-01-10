package practicequestions;

public class ManagerChild extends EmployeeBaseClass{
	int basic;
	int da;
	int hra;
	public ManagerChild(int basic,int da,int hra) {
		this.basic=basic;
		this.da=da;
		this.hra=hra;
	}
	
	public void calculateSalary() {
		System.out.println("Manager");
		System.out.println();
		int salary = basic+da+hra;
		System.out.println("Salary :"+salary);
	}

}
