
public class Method {
	
	/*public static void Main(String arg[]) {
		sayHello("EiCho");
	}
	public static void sayHello(String name){
		System.out.println("Hello :" + name);
	}*/
	
	public static void Main (String arg[]) {
		int a = getarea(20,19);
		System.out.println("Area:" + a);
	}
	public static int getarea(int width, int height) {
		int area = width * height;
		return area;
	}
	
}
