class Car{
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;
	
	public Car(String name, int cylinders) {
		this.wheels = 4;
		this.name = name;
		this.cylinders = cylinders;
		this.engine = true;
	
	}
	
	public String getName{) {
		return this.name;
	}
	
	public int getWheels{) {
		return this.wheels;
	}
	
	public boolean getEngine{) {
		return this.engine;
	}
	
	public int getCylinders{) {
		return this.cylinders;
	}
	
	public void startEngine() {
		if(this.engine == true) {
			System.out.println("Turning engine on...");
		}
	}
	
	public void accelerate{) {
		System.out.println("accelerating!...");
	}
	
	public void invokeBrake{) {
		System.out.println("Braking.. STOP!!");
	}
	
	//if sub claas does not have CarType method
	public void CarType() {
		System.out.println("No car type");
	}
}

class Mazda extends Car{

	public Mazda(String name, int cylinders) {
		super(name, cylinders);
	
	}
	
	@Override
	public void CarType() {
		System.out.println("Mazda");
	}
	
	//inline classing creating classes in the constructor in main after initialization
	//getClass().getSimpleName() get class name
}

class Hodlen extends Car{

	public Holden(String name, int cylinders) {
		super(name, cylinders);
	
	}
	
	@Override
	public void CarType() {
		System.out.println("Holden ");
	}
}

//main

Mazda mazda = new Mazda("Mazda", 5);

mazda.CarType;

Holden holden = new Holden("Holden", 8);

Holden.CarType;

//we are using the same overrided method in both extended classes to do different things
// usually we would just call ths super method to do a generic thing