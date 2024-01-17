package encapsulationpractice;

/*Write a Java program to create a class called Circle with a private instance variable 
 * radius. Provide public getter and setter methods to access and modify the radius variable.
 *  However, provide two methods called calculateArea() and calculatePerimeter() that return 
 *  the calculated area and perimeter based on the current radius value.*/
public class EncapCircle {
private double radius;

public void setter(double radius) {
	this.radius=radius;
}

public void calculateArea() {
	double area = Math.PI*radius*radius;
	System.out.println("Area :"+area);
}

public void calculatePerimeter() {
	double perimeter = 2*Math.PI*radius;
	System.out.println("Perimeter :"+perimeter);
}

public void getter() {
	this.calculateArea();
	this.calculatePerimeter();
}
}
