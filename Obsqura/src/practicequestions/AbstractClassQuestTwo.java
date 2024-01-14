package practicequestions;

public class AbstractClassQuestTwo {

	public static void main(String[] args) {
		AbstractClassSquare square = new AbstractClassSquare(5.0);
		System.out.println("Area of Square :"+square.area());
		System.out.println("Perimeter of Square :"+square.perimeter());
		
		AbstractClassTriangle triangle = new AbstractClassTriangle(12.5,14.2,10.4);
		System.out.println("Area of Triangle :"+triangle.area());
		System.out.println("Perimeter of Triangle :"+triangle.perimeter());


	}

}
