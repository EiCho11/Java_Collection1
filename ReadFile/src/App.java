import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class App {
	public static void main(String[] args) throws FileNotFoundException  {
		String filename = "C:\\note.txt";
		//String filename = "note.txt"; //same prj file path
		
		File file = new File(filename);
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String text = scan.nextLine();
			System.out.println(text);
		}
		scan.close();
		
	}
}
