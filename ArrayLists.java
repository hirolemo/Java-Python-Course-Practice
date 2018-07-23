public class GroceryList {
	
	private ArrayList<String> groceryList = new ArrayList<String>();   //not defining type, can hold objects
	//tell Java elements held are of String type
	//Arraylist is a class and can therefore have its own constructor
	
	
	public void addGroceryItem(String item) { //to store in list
		//call method part of al class
		groceryList.add(item); // method to add to list
	}
	
	public void printList() {
		System.out.println("You have " + groceryList.size() + "items in ur list");
		//to get actual values in list
		
		for(int i=0; i< groceryList.size(); i++) {
		 //.get returns item at index i
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	//replace an item
	public void modifyItem(int position, String newItem) {
		groceryList.set(position, newItem); //sets item to supplied index
		System.out.println("Grocery item " + (poosition +1) + " has been modified");
	}
	
	//remove item
	public void removeItem(int position) {
		String theItem = groceryItem.get(position);
		groceryList.remove(position); //remvoes item at index, condenses list accordingly
	}
	
	public String findItem(String SearchItem) {
		//use methods!! find and return!
		boolean exists = groceryList.contain(SearchItem); // returns true if in list
		int position = groceryList.indexOf(searchitem); //returns index position of item (if -1 not found)
		
		if(position >=0) return groceryList.get(position);
		
		return null; // if not found
	}
	
	//excepts item, finds position, and then replaces
	public void modifyGroceryList(String item) {
		int position = findItem(item);
		if(position >= 0) modifyGroceryItem(position, item); //overloaded -> prints
		
		// *standard to find the item, and then pass the position for removal/modification
	}
	
	public int findItem(String searchItem) {
		return groceryList.indexOf(searchItem);
	}
	
	//make modify and remove mehtods to private so users can crazily modify list
}

//Main

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {
		boolean quit = false;
		//accept entries and use switch case (0 instructions, 1 print list, 2 add item, 3 modify, 4 remove item, 5 search, 6 bool is true for quitting
	}
	
	