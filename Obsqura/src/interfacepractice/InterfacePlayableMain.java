package interfacepractice;

public class InterfacePlayableMain {
	
	public static void main(String args[]) {
	InterfacePlayableFootball foot = new InterfacePlayableFootball();
	InterfacePlayableVolley volley = new InterfacePlayableVolley();
	InterfacePlayableBasketBall basket = new InterfacePlayableBasketBall();
	
	foot.play();
	volley.play();
	basket.play();
	}
}
