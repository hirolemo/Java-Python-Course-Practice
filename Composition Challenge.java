public class Room{

	private int closets;
	private Drawer drawer;
	private int beds;
	private Desk desk;
	
	public Room(int closets, Drawer drawer, int beds, Desk desk){
	
		this.closets = closets;
		this.drawer = drawer;
		this.beds = beds;
		this.desk = desk;
	}
	
	public int getclosets(){
		return this.closets;
	}
	
	public Drawer getdrawer(){
		return this.drawer;
	}
	
	public int getBed(){
		return this.beds;
	}
	
	public Desk getDesk(){
		return this.Desk;
	}
	
}

//Main
public class Main{
	public static void main(String[] args) {
		Drawer drawer = new Drawer(4,5);
		Desk desk = new Desk(new PencilCase(3, 2, 10), 30, "Dave");
		
		Room myRoom = new Room(2, drawer, 2, desk);
		
		//Access stationaries in Room IN desk VIA GETTER
		myRoom.getDesk.getTotalStationaries();
		
		
	
	}

}






public class Drawer{

	private int firstLayer;
	private int secondLayer;
	//How many clothes articles in each layer
	
	public Drawer(int first, int second) {
		this.firstLayer = first;
		this.secondLayer = second;
	
	}
	
	//new
	public void getStuff() {
		int sum = getTotalClothes;
		System.out.println("Total clothes in drawer: " + sum);
	}
	
	
	//too access this use ^^^
	private void getTotalClothes(){ //2nd example
		return firstLayer + secondLayer;
	}

}

public class Desk{

	private PencilCase Case; //of type PencilCase class
	private int papers;
	private String nameTag;
	
	public Desk(PencilCase Case, int papers, String nameTag) {
	
		this.Case = Case;
		this.papers = papers;
		this.nameTag = nameTag;
	}
	
}

public class PencilCase{

	private int pencils;
	private int erasers;
	private int staples;
	
	public PencilCase(int pencils, int erasers, int staples) {
		this.pencils = pencils;
		this.erasers = erasers;
		this.staples = staples;
	}
	
	public void getTotalStationaries() {
		return (this.pencils + this.erasers + this.staples);
	}

}