package review;

public class StudentDetails {
	
	String name;
	int roll_no;
	public StudentDetails(String name,int roll_no) {
		this.name=name;
		this.roll_no=roll_no;
	}
	public void display() {
		System.out.println(name);
		System.out.println(roll_no);
	}

	public static void main(String[] args) {
		
		StudentDetails ob = new StudentDetails("Anu",11);
		ob.display();
	}

}
