package exercicio;

class Machines {
    public void start() {
        System.out.println("Starting machine ...");
    }
}

interface Plant {
    public void grow();
}

public class AnonymousClass {
    public static void anonymous() {      
        // This is equivalent to creating a class that "extends"
        // Machines and overrides the start method.
        Machines machine1 = new Machines() {
            @Override public void start() {
                System.out.println("Camera snapping ....");
            }
        };
        
        machine1.start();
        // This is equivalent to creating a class that "implements"
        // the Plant interface
        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing");
                
            }
        };
        
        plant1.grow();
    }
}