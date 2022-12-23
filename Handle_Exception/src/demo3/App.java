package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class App {
	public static void main(String[] args) {
		File file = new File("note.txt"); 			//file name is not same so err
		try {
			readFile(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not Found....");
		}
			System.out.println("Continue...");
	}
	public static void readFile (File file) throws FileNotFoundException {
		FileReader fr = new FileReader(file);
	}
}
