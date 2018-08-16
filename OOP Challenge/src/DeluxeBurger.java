public class DeluxeBurger extends BasicBurger {

    private String chips;
    private String drink;

    public DeluxeBurger(int meat, double basePrice, String chips, String drink) {
        super("Protein Nut", meat, basePrice);
        this.chips= chips;
        this.drink = drink;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    //make sure other additions not allowed --> override add functions
    // and just change code so method call goes to these functions instead of super-class

    @Override
    public void setLettucePieces(int lettucePieces) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void setTomatoes(int tomatoes) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void setCarrots(int carrots) {
        System.out.println("Cannot add additional items.");
    }

    @Override
    public void setPickles(int pickles) {
        System.out.println("Cannot add additional items.");
    }
}
