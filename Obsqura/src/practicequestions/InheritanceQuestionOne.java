package practicequestions;

/*Create a class with a method that prints "This is parent class" and 
its subclass with another method that prints "This is child class". 
Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/

class ParentClass{
	public void baseclass() {
		System.out.println("This is parent class");
	}
}

class ChildClass extends ParentClass{
	public void derivedclass() {
		System.out.println("This is child class");	
	}
}

public class InheritanceQuestionOne {

	public static void main(String[] args) {
		ParentClass ob = new ParentClass();
		ChildClass ob1 = new ChildClass();
		ob.baseclass();
		ob1.derivedclass();
		ob1.baseclass();

	}

}
