package exercicio;

public class Casting {
	public static void casting() {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();
        machine1.start();
        camera1.start();
        camera1.snap();
         
        Util.textLn("Upcasting");
        Machine machine2 = camera1;
        machine2.start();
        // error: machine2.snap();
        
        Util.textLn("Downcasting");
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.start();
        camera2.snap();
        
        // Doesn't work --- runtime error.
        Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();
        // camera3.snap();
	}
}
class Machine {
    public void start() {
        Util.textLn("Machine started.");
    }
}
class Camera extends Machine {
    public void start() {
    	Util.textLn("Camera started.");
    }
    public void snap() {
    	Util.textLn("Photo taken.");
    }
}