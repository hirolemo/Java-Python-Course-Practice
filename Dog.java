// this class is going to inherit the Animal class
public class Dog extends Animal { // class Dog inherits extends or "inherits" Animal class's features

	private int eyes;  // these fields are specific to a dog
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	
	//Dog constructor
	
	// delete int brain and int body cuz we know all dogs have 1
	// And add extra fields above to constructor definition for initialization
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight); // 1 cuz we don't have them const definition anymore
		// calls constructor from Animal class, *defining inherited fields*
		
		// to initialize extra fields
		this.eyes = eyes;
		this.legs = legs;
		this.tall = tail;
		this.teeth = teeth;
		this.coat = coat;
	} 
	
	// we can now assign extra fields to this class since.. it is a class!
	// this class has base characteristics cuz they aren't specific to a dog
	//  Dog class can use methods from Animal super class so long as public even if not defined here
	@Override //nows that this is the equivalent method from the Animal superclass
	//Overriding a method in a super-class
	public void eat() {
		System.out.println("Dog.eat() called");
		super.eat(); // CRUCIAL: Calls the method equivalent in the super class
		//^^specifying to used eat method IN SUPER CLASS
		//there could be a .eat() method in Dog class to so we need to specify
		//can also call other methods in Dog class inside here
	
	}
}

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {

        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {  // Movee muscles and backfins and THEN the WHOLE ANIMAL moves by calling the super class method in Animal class
        moveMuscles();
        moveBackFin();
        super.move(speed);


    }
}

	
