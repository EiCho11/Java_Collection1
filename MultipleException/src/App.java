import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		Test t1 = new Test();
		/*try {
			t1.start();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		try {
			t1.start();
			t1.run();
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}

}
