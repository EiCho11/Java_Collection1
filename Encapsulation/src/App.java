class Student {
	private String name;
	private String age;
	private int mark;
	public Student(String name, String age, int mark) {
		this.name = name;
		this.age = age;
		this.mark = mark;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
}
public class App {
	public static void main(String argsd[]) {
		Student std1 = new Student("Ei Cho","22",98);
		Student std2 = new Student("Ei Phyu","20",92);
		getStudent(std1);
		getStudent(std2);
	}
	public static void getStudent(Student student) {
		System.out.println(student.getName());
	}
}
