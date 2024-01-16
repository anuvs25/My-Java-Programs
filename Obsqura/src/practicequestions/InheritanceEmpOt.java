package practicequestions;

public class InheritanceEmpOt extends InheritanceEmpHours {
	
	public void otAmount(double ot) {
		double ext_hrs = (ot-40);
		if (ot>=40) {
			System.out.println("The employee is eligible for OT");
		}
		else {
			System.out.println("The employee is not eligible for OT");
		}
		
		double ot_amt = 150*ext_hrs;
		System.out.println("OT of employee is "+ot_amt);
	}

	public static void main(String[] args) {
		InheritanceEmpHours emphr = new InheritanceEmpHours();
		double tot_time = emphr.EmpHours(8.5, 8.75, 9, 10.5, 8);
		System.out.println(tot_time);
		InheritanceEmpOt ot = new InheritanceEmpOt();
		ot.otAmount(tot_time);
	}

}
