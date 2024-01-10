package practicequestions;

public class PolymorphismQuestThree {

	public static void main(String[] args) {
		NewShape shape = new NewShape();
		shape.calculateArea();
		NewCircle circle = new NewCircle(5);
		circle.calculateArea();
		NewRectangle rectangle = new NewRectangle(3,5);
		rectangle.calculateArea();
		NewTriangle triangle = new NewTriangle(12,6);
		triangle.calculateArea();

	}

}
