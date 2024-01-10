package encapsulationexample;

public class EncapsulationsampleOne {
	 private int length;
	 private int breadth;
	
	public void setter(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void getter() {
		int area = length*breadth;
		System.out.println("Area of rectangle is "+area);
		
	}
	

}
