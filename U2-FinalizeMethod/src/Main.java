import java.io.*;
class Vehicle{
	int id;
	boolean isRunning;
	boolean isOn;
	String name;
	InputStreamReader insr;
	BufferedReader bfr;
	
	public void setName()throws IOException{
		insr = new InputStreamReader(System.in);
		bfr = new BufferedReader(insr);
		System.out.println("Enter Vehicle Name");
		this.name = bfr.readLine();
	}
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
	
	protected void finalize()throws IOException{
		System.out.println("Finalized Called");
		bfr.close();
		insr.close();
		
	}
}

public class Main {
	public static void main(String[] args)throws IOException{
		Vehicle v = new Vehicle();
		v.setName();
		v.start();
		v.run();
		v.stop();
	}
}