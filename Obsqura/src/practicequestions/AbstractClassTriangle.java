package practicequestions;

public class AbstractClassTriangle extends AbstractClassGeometricShape {
	private double tri_side_1;
	private double tri_side_2;
	private double tri_side_3;
	
	public AbstractClassTriangle(double tri_side_1,double tri_side_2,double tri_side_3) {
		this.tri_side_1=tri_side_1;
		this.tri_side_2=tri_side_2;
		this.tri_side_3=tri_side_3;
	}
public double area() {
		double s = (tri_side_1+tri_side_2+tri_side_3)/2;
		double tri_area = Math.sqrt(s*(s-tri_side_1)*(s-tri_side_2)*(s-tri_side_3));
		return tri_area;
	}
	
	public double perimeter() {
		double tri_peri = (tri_side_1+tri_side_2+tri_side_3);
		return(tri_peri);
	}
}
