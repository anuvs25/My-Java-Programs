package polymorphismpractice;

/* Write a Java program to create a base class Shape with methods draw() 
 * and calculateArea(). Create two subclasses Circle and Cylinder. 
 * Override the draw() method in each subclass to draw the respective shape. 
 * In addition, override the calculateArea() method in the Cylinder subclass to 
 * calculate and return the total surface area of the cylinder.*/

public class PolymorphismShape {

	public void draw() {
		System.out.println("Drawing Shape....");
	}
	
	public void calculateArea(double radius,double height) {
		System.out.println("Total Surface Area of Shape....");
	}
}
