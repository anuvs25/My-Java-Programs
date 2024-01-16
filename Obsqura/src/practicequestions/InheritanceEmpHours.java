package practicequestions;

/*Program to find the total OT amount an employee 
Class1
Get working hours of employee for 5 days.
Find the total working hours
Class 2 
If the total working hours is greater than 40 hrs, he is eligible for OT.
Per hour OT rate is 150/-
Calculate the OT amount as extra hours worked * OT rate/hr*/

public class InheritanceEmpHours {
	double mon;
	double tue;
	double wed;
	double thu;
	double fri;
public double EmpHours(double mon,double tue,double wed,double thu,double fri) {
	this.mon=mon;
	this.tue=tue;
	this.wed=wed;
	this.thu=thu;
	this.fri=fri;
	double tot_hrs = mon+tue+wed+thu+fri;
	return tot_hrs;
}
}
