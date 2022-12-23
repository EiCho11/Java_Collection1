class Thing{
	public String name;
	public static String description;
	
	public void showName() {
		System.out.println(name);
	}
	
	public static void sayHi() {
		System.out.println("Hi");
	}
	
	public static void showInfo() {
		System.out.println(description);
		sayHi();	//static keyword
		//showNmae();  no static keyword 
	}
	
	public final static int x=3;
}
public class App {

	public static void main(String[] args) {
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "Mg Mg";
		thing2.name = "Ei Cho";
		
		Thing.description = "Hello";
		Thing.showInfo();
		
		System.out.println(thing1.name);
		System.out.println(thing2.name);
		System.out.println(Thing.description);
		
		System.out.println(Thing.x);
	}

}
