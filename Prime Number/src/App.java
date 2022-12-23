import java.util.Scanner;
public class App {
	public static void main(String args[]) {
		boolean isprime = true;
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = input.nextInt();
		
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				isprime = false;
			}
		}
		
		if(isprime) {
			System.out.println("It is prime Number.");
		}else {
			System.out.println("It is not prime Nmuber");
		}
	}
}
		