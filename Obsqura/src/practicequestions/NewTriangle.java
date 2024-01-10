package practicequestions;

public class NewTriangle extends NewShape {
	double base;
	double height;

	public NewTriangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	
	public void calculateArea() {
		double trian_area = 0.5*base*height;
		System.out.println("The area of triangle is "+trian_area);
	}
}
