package stringclass;

public class StringBuilderSample {

	public static void main(String[] args) {
	StringBuilder ob = new StringBuilder("Welcome to the world of JAVA");
	System.out.println(ob);
	ob.append("Programming"); // append
	System.out.println(ob);
	ob.insert(15,"beautiful "); //insert
	System.out.println(ob);
	ob.replace(33, 49, " Programming"); //replace
	System.out.println(ob);
	ob.delete(14, 24);	//delete
	System.out.println(ob);
	ob.reverse(); //reverse
	System.out.println(ob);
	

	}

}
