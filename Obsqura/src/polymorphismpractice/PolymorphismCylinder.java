package polymorphismpractice;
/* Write a Java program to create a base class Shape with methods draw() 
 * and calculateArea(). Create two subclasses Circle and Cylinder. 
 * Override the draw() method in each subclass to draw the respective shape. 
 * In addition, override the calculateArea() method in the Cylinder subclass to 
 * calculate and return the total surface area of the cylinder.*/
public class PolymorphismCylinder extends PolymorphismShape {

	public void draw() {
		super.draw();
		System.out.println("Drawing Cylinder....");
		
	}
	
	public void calculateArea(double radius,double height) {
		double tot_sa = 2*Math.PI*radius*(radius+height);
		System.out.println("Total Surface Area of Cylinder is "+ tot_sa);
	}
	
	public static void main(String args[]) {
		PolymorphismCylinder cylinder = new PolymorphismCylinder();
		cylinder.draw();
		cylinder.calculateArea(5, 10);
	}
}
