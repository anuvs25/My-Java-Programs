package interfacepractice;

public class InterfaceShapeMain {

	public static void main(String[] args) {
		InterfaceShapeTriangle triangle = new InterfaceShapeTriangle();
		triangle.getArea();
		InterfaceShapeCircle circle = new InterfaceShapeCircle();
		circle.circleArea(13);
		circle.getArea();
		InterfaceShapeRectangle rectangle = new InterfaceShapeRectangle();
		rectangle.getArea();
		

	}

}
