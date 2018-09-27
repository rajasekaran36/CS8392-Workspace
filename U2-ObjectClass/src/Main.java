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
}

public class Main {
	public static void main(String[] args){
		Vehicle v = new Vehicle();
		
		Object obj = new Vehicle();
		
		System.out.println("String Value :"+obj.toString());
		System.out.println("Hashcode Value :"+obj.hashCode());
		System.out.println("Obj vs Obj :"+obj.equals(obj));
		System.out.println("Obj vs Vehicle :"+obj.equals(v));
		System.out.println("Class of Obj :"+obj.getClass());
	}
}