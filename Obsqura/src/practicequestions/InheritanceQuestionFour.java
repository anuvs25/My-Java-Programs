package practicequestions;

/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. 
Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter 
for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. 
Print the area and perimeter of a rectangle and a square.*/

/*Now repeat the above example to print the area of 10 squares.
Hint-Use array of objects */

class Rectangle{
	int length;
	int breadth;
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
		
	}
	 public void area() {
		int area = length*breadth; 
		System.out.println("The area is " + area);
	 }
	 public void perimeter() {
		 int perimeter = 2*(length+breadth);
		 System.out.println("The perimeter is " + perimeter);
	 }
}

class Square extends Rectangle{
	public Square(int side) {
		super(side,side);	
	}
}


public class InheritanceQuestionFour {

	public static void main(String[] args) {
		Rectangle ob = new Rectangle(10,15);
		ob.area();
		ob.perimeter();
		Square s = new Square(5);
		s.area();
		s.perimeter();

	}

}
