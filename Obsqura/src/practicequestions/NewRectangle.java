package practicequestions;

public class NewRectangle extends NewShape {
	int length;
	int breadth;
	
	public NewRectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public void calculateArea() {
		int rect_area = length*breadth;
		System.out.println("The area of rectangle is "+rect_area);
	}

}
