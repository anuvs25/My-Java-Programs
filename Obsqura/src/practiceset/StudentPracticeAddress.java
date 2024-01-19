package practiceset;

public class StudentPracticeAddress {
	String address;
public StudentPracticeAddress(String address) {
	this.address=address;
	System.out.println("Address : "+address);
}

public static void main(String args[]) {
	StudentPractice details = new StudentPractice("Anu",11);
	StudentPracticeAddress addrs = new StudentPracticeAddress("Trivandrum,Kerala,India");
}
}
