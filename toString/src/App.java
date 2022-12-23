class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String tostring() {
		//return name + ":" + age;
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(":").append(age);
		return(sb.toString());
	}
}
public class App {

	public static void main(String[] args) {
		Person person1 = new Person("Ei Cho",24);
		Person person2 = new Person("Ei Phyu",22);
		System.out.println(person1.tostring());
		System.out.println(person2.tostring());
	}

}
