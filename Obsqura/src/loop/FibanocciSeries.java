package loop;

public class FibanocciSeries {

	public static void main(String[] args) {
		int n = 10;
		int prev_value = 0;
		int pres_value = 1;
		//System.out.println(value);
		for(int i=1;i<=n;i++) 
		{
			System.out.print(prev_value+", ");
			int next_val = prev_value+pres_value;
			prev_value =pres_value;
			pres_value = next_val;
			
		}

	}

}
