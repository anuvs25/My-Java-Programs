package stringclass;

public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer ob = new StringBuffer("Hello Anu..");
		System.out.println(ob);
		ob.append("To"); // append
		System.out.println(ob);
		ob.insert(10,"Welcome"); //insert
		System.out.println(ob);
		ob.replace(10, 17, "JAVA");
		System.out.println(ob);
		ob.delete(10, 17);
		System.out.println(ob);
		ob.reverse();
		System.out.println(ob);

	}

}

