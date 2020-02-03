public class BurgerShops {
    public static void main(String[] args) {

        TheBestBurgersHere theBestBurgersHere = new TheBestBurgersHere();

        YourBurgers yourBurgers = new YourBurgers();

        Burger b1 = new Burger("Regular", 3);
        Burger b2 = new Burger("Double", 5);
        Burger b3 = new Burger("Regular", 3);
        Burger b4 = new Burger("Double", 5);

        yourBurgers.createdBurgers(b4);
        yourBurgers.createdBurgers(b1);
        yourBurgers.createdBurgers(b2);
        yourBurgers.createdBurgers(b3);

        System.out.println("----------------------------------------");

        theBestBurgersHere.createdBurgers(b1);
        theBestBurgersHere.createdBurgers(b2);
        theBestBurgersHere.createdBurgers(b3);
        theBestBurgersHere.createdBurgers(b4);

        System.out.println("----------------------------------------");

        theBestBurgersHere.getTotalAmountCreatedBurgers();
        theBestBurgersHere.getTotalPriceCreatedBurgers();

        System.out.println("----------------------------------------");

        theBestBurgersHere.soldBurgers(b1);
        theBestBurgersHere.getTotalAmountSoldBurgers();
        theBestBurgersHere.getTotalPriceSoldBurgers();

        System.out.println("----------------------------------------");

        theBestBurgersHere.getTotalAmountRemainingBurgers();
        theBestBurgersHere.getTotalPriceRemainingBurgers();

        System.out.println("----------------------------------------");



    }
}

