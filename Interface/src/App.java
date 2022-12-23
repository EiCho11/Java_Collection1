public class App {

	public static void main(String[] args) {
		Machine mc = new Machine();
		Person person = new Person("Ei Cho");
		
		Info info1 = new Machine();
		Info info2 = person;
		Info info3 = new Info() {
			public void showInfo() {
				System.out.println("I am showInfo");
			}
		};
		info1.showInfo();
		info2.showInfo();
		info3.showInfo();
		
		outputInfo(info1);
	}
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
