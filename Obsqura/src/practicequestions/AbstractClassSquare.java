package practicequestions;

public class AbstractClassSquare extends AbstractClassGeometricShape{
	private double side;
	
	public AbstractClassSquare(double side) {
		this.side=side;
	}
	
	public double area() {
		double area_sq = side*side;
		return(area_sq);
	}
	
	public double perimeter() {
		double peri_sq = 4*side;
		return(peri_sq);
	}


}
