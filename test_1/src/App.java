public class App {
	public static void main (String[] args) {
		int [] values;
		values = new int[3];
		
		values[0] = 11;
		values[1] = 32;
		values[2] = 43;
		
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
	}
}