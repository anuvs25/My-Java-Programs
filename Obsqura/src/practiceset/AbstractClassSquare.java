package practiceset;

public class AbstractClassSquare extends AbstractClassGeometricShape{
	double side;
	public void Square(double side) {
		this.side=side;
	}
	
	public void area() {
		double area = side*side;
		System.out.println("Area of Square: "+area);
	}
	public void perimeter() {
		
		double perimeter =4*side;
		System.out.println("Perimeter of Square: "+perimeter);
		
	}
}
