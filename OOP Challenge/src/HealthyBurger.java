public class HealthyBurger extends BasicBurger {

    private int tofu;
    private int beans;

    public HealthyBurger(int meat, double basePrice) {
        super("Whole Weat", meat, basePrice);

        tofu = 0;
        beans = 0;
    }
    // tofu cost 1.50 per serving, beans 0.20

    public void setTofu(int tofu) {
        this.tofu = tofu;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    @Override
    public double printPriceAddItems() {
        double sumTotal = super.printPriceAddItems(); // don't wanna change super class method? feed it into a variable and continue!
        System.out.println("Additional items: tofu & beans \n Tofu - " + (this.tofu*1.50) + " Beans - " + (this.beans*0.20));
        DisplayTotal(sumTotal + (this.tofu*1.50) + (this.beans*0.20));
        return 1.0;
    }
}
