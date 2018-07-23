//Inheritance Challenge

//*NOTES*: steering and speed apply to all vehicles, should've put in Vehicle class
//Make methods for moving and steering (change direction?) in Vehicle class


public class Vehicle{

	private String vehicleType;
	private int steering;
	private int height;
	private int speed;
	
	public Vehicle(String vehicleType, int height) {
		this.vehicleType = vehicleType;
		this.height = height;
		
		//initialize spped and direction to 0
		this.steering = 0;
		this.speed = 0'
	
	}
	
	
	public void changeSpeed(int speed) {
		this.speed+=speed;
	}
	
	public void changeDirection(int steering) {
		this.steering += steering;
	}
	
	public void move(int speed, int direction) {
		this.speed+=speed;
		this.steering += steering;
	}
	
	//Getters
	public void getCurrentVelocity() {
		return this.speed;
	}
	
	public void getCurrentDirection(){
		return this.steering;
	}
}

public class Car extends Vehicle{
	
	private int gears;
	private int wheels;
	private int seats;
	
	public Car(String carModel, int height, int gears, int wheels, int seats) {
		super(carModel, height);
		this.steering = steering;
		this.gears = gears;
		this.seats = seats;
	}
}	

public class Mazda extends Car{
	private String logoLetter;
	// dont need model or size cuz we have that info in class name!
	public Mazda(String logoLetter) {
		super("Mazda", 5, 4, 4, 8);
		this.logoLetter = logoLetter;
	}
	
	//when making sub-classes, you know the specifics, 
	//so set them as actual values in super constructor call and shorten your sub-class definition!!
	
	


}

//Inheritance gives you flexibilty to model real-lie objects (break down into sub classes), svaes oding

	
	



