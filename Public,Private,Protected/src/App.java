import world.Person;

/*
	public --- only within same class
	private --- from any where
	protected --- same class,same package and subclass
	no modifier --- same package only
*/

public class App {
	public static void main (String[] args) {
		student student = new student();
		Person person = new Person();
		person.name = "Ei Cho";
		
		System.out.println(person.name);
		System.out.println(person.ID);
	}
}
