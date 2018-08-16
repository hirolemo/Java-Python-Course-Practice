public class BasicBurger {
    private String breadRoll;
    private int meat;
    //4 additional items
    private double basePrice;
    private String name;

    private int lettucePieces;
    private int tomatoes;
    private int carrots;
    private int pickles;

    public BasicBurger(String breadRoll, int meat, double basePrice) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;

        this.lettucePieces = 0;
        this.tomatoes = 0;
        this.carrots = 0;
        this.pickles = 0;

        this.name = "";

        //assign cost to each additional topping and multiply by number in var for cumulative price
    }
    //assign cost to each additional topping and multiply by number in var for cumulative price
    // lettuce == $1, tomatoes == $2, carrots == $.50, pickles == $.80

    //Sets/asks amount of each item on burger then later multiples by unit price
    public void setLettucePieces(int lettucePieces) {
        this.lettucePieces = lettucePieces;
    }

    public void setTomatoes(int tomatoes) {
        this.tomatoes = tomatoes;
    }

    public void setCarrots(int carrots) {
        this.carrots = carrots;
    }

    public void setPickles(int pickles) {
        this.pickles = pickles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public int getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public int getLettucePieces() {
        return lettucePieces;
    }

    public int getTomatoes() {
        return tomatoes;
    }

    public int getCarrots() {
        return carrots;
    }

    public int getPickles() {
        return pickles;
    }

    public double printPriceAddItems() {
        System.out.println("Burger base price: " + this.basePrice);
        System.out.println("Price of items: Lettuce - " + this.lettucePieces + " Tomatoes - " + this.tomatoes*2 +
        " Carrots - " + this.carrots*0.50 + " Pickles - " + this.pickles*0.80);
        return((this.basePrice) + (this.lettucePieces) + (this.tomatoes*2) + (this.carrots*0.50) + (this.pickles*0.80));
    }

    public void DisplayTotal(double price) {
        System.out.println("Total price is: " + price);
    }
}
