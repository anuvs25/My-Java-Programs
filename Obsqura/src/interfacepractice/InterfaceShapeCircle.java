package interfacepractice;

public class InterfaceShapeCircle implements InterfaceShape{
	private double radius;
	
	public void circleArea(double radius) {
		this.radius=radius;	
	}
	
	public void getArea() {
		double area = Math.PI*radius;
		System.out.println("Area of Circle :	"+area);
	}

}
