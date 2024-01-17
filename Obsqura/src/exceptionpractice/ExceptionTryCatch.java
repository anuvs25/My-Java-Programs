package exceptionpractice;

public class ExceptionTryCatch {
	public void arthimeticExceptionSample() {
		int a =100;
		int b= 0;
		try {
		System.out.println("Result:"+a/b);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void nullPointerExp() {
		String s = null;
		try {
		System.out.println(s.length());
		}
		catch(Exception e){
			System.out.println("Null pointer exception " + e);
		}
	}
	
	public void first_method() {
		int arr[] = new int[6];
		try {
		arr[5] =20;
		System.out.println(arr[6]);
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		finally {
			System.out.println("Exception occured or not this code in finally executes");
		}
	}

	public static void main(String[] args) {
		ExceptionTryCatch ob = new ExceptionTryCatch();
		ob.arthimeticExceptionSample();
		ob.nullPointerExp();
		ob.first_method();

	}

}
