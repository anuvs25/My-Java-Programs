package practicequestions;

public class StudentGrade {
	String name;
	int eng;
	int maths;
	int bio;
	
	public StudentGrade(String n, int e, int m, int b) {
		name =n;
		eng = e;
		maths = m;
		bio = b;
		System.out.println("Marks sheet of "+name);
		System.out.println();
		System.out.println("Marks obtained for English	: "+eng);
		System.out.println("Marks obtained for Maths	: "+maths);
		System.out.println("Marks obtained for Biology	: "+bio);
	}
	public int marks() {
		int tot_marks = eng+maths+bio;
		return tot_marks;
	}
	
	public static void grade(int total) {
		if (total>=280) {
			System.out.println("The student has got A+");
		}else if(260<=total&& total<280) {
			System.out.println("The student has got A");
		}else if(240<=total&& total<260) {
			System.out.println("The student has got B+");
		}else if(220<=total&& total<240) {
			System.out.println("The student has got B");
		}else if(200<=total&& total<220) {
			System.out.println("The student has got C+");
		}else if(180<=total&& total<200) {
			System.out.println("The student has got C");
		}else if(160<=total&& total<180) {
			System.out.println("The student has got D");
		}else if(140<=total&& total<160) {
			System.out.println("The student has got E");
		}else {
			System.out.println("The student is failed");
		}
	}

	public static void main(String[] args) {
		StudentGrade ob = new StudentGrade("Anu",95,100,92);
		int student_one = ob.marks();
		System.out.println("Total marks obtained out of 300	: "+student_one);
		System.out.println();
		StudentGrade.grade(student_one);

	}

}
