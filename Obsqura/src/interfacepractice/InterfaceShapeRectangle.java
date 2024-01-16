package interfacepractice;

public class InterfaceShapeRectangle implements InterfaceShape {
	private int length=15;
	private final int breadth =20;
	
	public void getArea() {
	System.out.println("Area of Rectangle :	"+length*breadth);
}
}
