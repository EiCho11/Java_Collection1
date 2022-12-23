
public class Person {
	int x;
	String y;
	public Person() {

	}
	
	public Person(int age) {
		x = age;
	}
	
	public void getAge() {
	System.out.println("Your age is :" + x);
	}
	
	public Person(String name) {
		y = name;
	}
	public void getName() {
		System.out.println("My name is "+ y);
	}
}
