package encapsulationpractice;

public class EncapStudentMain {

	public static void main(String[] args) {
		EncapStudent student = new EncapStudent();
		student.setter(15,"Ardra", 'A');
		student.getter();
		student.addGrade(85,81,92);
	}

}
