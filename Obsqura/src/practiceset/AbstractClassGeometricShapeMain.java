package practiceset;

public class AbstractClassGeometricShapeMain {

	public static void main(String[] args) {
		AbstractClassTriangle triangle = new AbstractClassTriangle();
		triangle.Triangle(5, 15);
		triangle.area();
		triangle.perimeter();
		AbstractClassSquare square = new AbstractClassSquare();
		square.Square(5);
		square.area();
		square.perimeter();

	}

}
