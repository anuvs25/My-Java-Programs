package practiceset;

public class AbstractClassTriangle extends AbstractClassGeometricShape{
	double base;
	double height;
	public void Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	
	public void area() {
		double area = 0.5*base*height;
		System.out.println("Area of Triangle: "+area);
	}
	public void perimeter() {
		
		double hypotenuse =Math.sqrt((base*base)+(height*height));
		double perimeter = base+height+hypotenuse;
		System.out.println("Perimeter of Triangle: "+perimeter);
		
	}
}
