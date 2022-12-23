import java.io.IOException;

public class Test {
	public void connect() throws ServerException{
		int code = checkServer();
		
		if(code != 0) {
			//throw new IOException("Cannot connect to server");
			throw new ServerException("Cannot connect to server");
		}
		System.out.println("Sucess");
	}

	private int checkServer() {
		//0 OK
		//err code 1 = not found
		//err code 2 = Internet err
		return 1;
	}
}
