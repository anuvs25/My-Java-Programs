package practicequestions;

public class NewCircle extends NewShape {
	double radius;
	public NewCircle(double radius) {
		this.radius=radius;
	}
	@Override
	public void calculateArea() {
		double circular_area = radius*radius*3.14;
		System.out.println("The area of circle is "+circular_area);
	}

}
