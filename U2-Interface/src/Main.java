import java.io.*;

interface VehicleOperations{
    
    public void start();
    
    public void stop();
}

interface VehicleAdvanced{
    
    public void accelerate();
    
    public void breaking();
    
}


class Bike implements VehicleOperations,VehicleAdvanced{

    boolean isOn=false;
    boolean isStarted=false;
    
    public void start(){
        System.out.println("Bike Started");
    }
    public void stop(){
        System.out.println("Bike Started");
    }
    public void accelerate(){
        System.out.println("Bike Accelerated");
    }
    public void breaking(){
        System.out.println("Bike Break pushed");
    }
    
}

public class Main{
    public static void main(String[] args){
        
        Bike b = new Bike();
        
        b.start();
        b.accelerate();
        b.breaking();
        b.stop();
            
    }
}