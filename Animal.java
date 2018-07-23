// Different kinds of objects have things in common (ex. computers mac or pc, both have RAM, on/off)
//OOP - create classes to inherit commmonly used stae of behaviour  from other classes

// create a basic calss to apply to any animal (

public class Animal {
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	public Animal(String name, int brain, int body, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	// Now create new class that will inherit the Animal class' state and behaviour (new tab)
    /
	// We can make methods in the super class that the inherited class can use by making methods public

	public void eat() {
		System.out.println("Animal.eat() called");
	}
	
	// the eat method can also be defined as an Overrided Method in the Dog class
}