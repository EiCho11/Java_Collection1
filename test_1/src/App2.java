public class App2 {	
	
	public static void main (String args[]) {
		String [] names= {"Mg Mg","Aung Aung","Aye Aye","Mya Mya"};
		
		for(String text : names) {
			System.out.println(text);
			
		}
		System.out.println("Second Loop");
		
		names[3] = "Ei Cho";
		for(String text : names) {
			System.out.println(text);
		}
	}
}
