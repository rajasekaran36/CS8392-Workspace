class Vehicle{
	int id;
	boolean isRunning;
	boolean isOn;
	
	public void start(){
		this.isOn = true;
		System.out.println("Vehicle Started");
	}
	
	public void run(){
		if(this.isOn == true){
			this.isRunning = true;
			System.out.println("This Vehicle is Running");
		}
		else {
			System.out.println("Please Start the Vehicle -- Running Failed");
		}
	}
	
	public void stop(){
		if(this.isOn == true && this.isRunning == true){
		this.isRunning = false;
		this.isOn = false;
		System.out.println("Vehicle is Stoped from Running");
		}
		else {
			if(this.isOn == true){
				System.out.println("Vehicle is not running but now it's turned off");
				this.isOn = false;
			}
			else
				System.out.println("Vehicle not even turned on so no need to stop");
		}
	}
	public void accelerate(){
		start();
		run();
		System.out.println("Vehicle is Accelerating");
	}
}
class Bike extends Vehicle{
	String owner;
	boolean isGeared;
	
	public Bike(){
		this.owner = "Rajasekaran";
		this.isGeared = true;
	}
	public void accelerate(){
		start();
		run();
		System.out.println("Turning Accelerator to adjust Fuel Throttle");
	}
	public void horn(){
		System.out.println("Push the horn button located in handlebar");
	}
}

class Car extends Vehicle{
	String owner;
	boolean isGeared;
	
	public Car(){
		this.owner = "Rajasekaran";
		this.isGeared = true;
	}
	public void accelerate(){
		start();
		run();
		System.out.println("Pushing Pedal to adjust Fuel Throttle");
	}
	public void horn(){
		System.out.println("Push the horn button located in steering");
	}
}

class Aircraft extends Vehicle{
	String owner;
	boolean isGeared;
	
	public Aircraft(){
		this.owner = "Rajasekaran";
		this.isGeared = true;
	}
	public void accelerate(){
		start();
		run();
		System.out.println("Pushing Throttle Leaver to adjust fuel to engine");
	}
}

public class Main {
	public static void main(String[] args){
		Bike b = new Bike();
		Car c = new Car();
		Aircraft ac = new Aircraft();
		b.accelerate();
		c.accelerate();
		ac.accelerate();
	}
}