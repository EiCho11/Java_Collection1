class Machine {
	public void start() {
		System.out.println("Machine started ...");
	}
}
class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Camera started ...");
	}
	
	public void snap() {
		System.out.println("Camera is taken photo...");
	}
	
}
public class App {
	public static void main (String args[]) {
		Machine mac1 = new Machine ();
		mac1.start();
		Camera cam1 = new Camera();
		cam1.start();
		cam1.snap();
		
		//UpCasting 
		Machine mac2 = cam1;
		mac2.start();
		//mac2.snap(); //err
		
		//DownCasting
		Camera cam2 = (Camera)mac2;
		cam2.start();
		cam2.snap();
		
		//Does not work it is runtime err
		Machine mac3 = new Machine();
		/*
		 * Camera cam3 = (Camera)mac3; cam3.start(); cam3.snap();
		 */
	}
}
