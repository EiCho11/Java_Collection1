import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number");
		 int num =  input.nextInt();
		do {
			System.out.println(num%2);
			num++;
		}while (num < 100);
	}
}
