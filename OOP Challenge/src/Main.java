public class Main {

    public static void main(String args[]) {
        BasicBurger burger = new BasicBurger("Whole Weat", 1, 4.50);
        burger.setLettucePieces(1);
        burger.setCarrots(5);
        burger.setTomatoes(4);
        burger.setPickles(1);
        burger.printPriceAddItems();


        HealthyBurger jurger = new HealthyBurger(4, 5.50);
        jurger.setBeans(4);
        jurger.setTofu(1);
        jurger.setTomatoes(3);
        jurger.setPickles(1);

        jurger.printPriceAddItems();


    }
}
