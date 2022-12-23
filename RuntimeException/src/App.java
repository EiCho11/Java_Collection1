public class App {
	public static void main (String[] args) {
//		int x = 4;
//		int y = x/0;
//		System.out.println(y); //ArrithmeticException under run time Exception
		
		String name = null;
		//System.out.println(name.length());
		//NullPointerException under run time exception
		
		String [] names = {"Mg Mg","Aung Aung","Su SU"};
		try {
		System.out.println(names[3]); 
		//ArrayIndexOutofBoundsException
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
