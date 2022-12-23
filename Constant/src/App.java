public class App {
	public static void main(String args[]) {
		String text = "I am Ei Cho. ";
		text = text + "I am programmer. ";
		text += "How about you ?";
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ,");
		sb.append("I'm Ei Cho.");
		System.out.println(sb.toString());
	}
}
