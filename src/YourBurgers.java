import java.util.ArrayList;
import java.util.List;

public class YourBurgers implements BurgerShop {

    List<Burger> listCreatedBurgers = new ArrayList<>();
    List<Burger> listRemainingBurgers = new ArrayList<>();
    List<Burger> listSoldBurgers = new ArrayList<>();

    @Override
    public void createdBurgers(Burger burger) {
        listCreatedBurgers.add(burger);
        System.out.println(getClass().getName() + ": New burger: " + burger.getName() + ", $" + burger.getPrice() + " was created successfully!");
        listRemainingBurgers.add(burger);
    }

    @Override
    public void soldBurgers(Burger burger) {

        listSoldBurgers.add(burger);
        System.out.println(getClass().getName() + ": The burger: " + burger.getName() + ", $" + burger.getPrice() + " was sold!");
        listRemainingBurgers.remove(burger);
    }

    @Override
    public List<Burger> getlistCreatedBurgers() {
        if (listCreatedBurgers.isEmpty()) {
            return null;
        } else {
            return (listCreatedBurgers);
        }
    }

    @Override
    public List<Burger> getlistSoldBurgers() {
        if (listSoldBurgers.isEmpty()) {
            return null;
        } else {
            return (listSoldBurgers);
        }
    }

    @Override
    public List<Burger> getlistRemainingBurgers() {
        if (listRemainingBurgers.isEmpty()) {
            return null;
        } else {
            return (listRemainingBurgers);
        }
    }

    @Override
    public void getTotalAmountCreatedBurgers() {

        System.out.println(getClass().getName() + ": Total amount of created burgers: " + getlistCreatedBurgers().size());
    }

    @Override
    public void getTotalPriceCreatedBurgers() {
        int price = 0;
        for (Burger burger : getlistCreatedBurgers()) {
            price += burger.getPrice();
        }
        System.out.println(getClass().getName() + ": Total price of created burgers is $" + price);
    }

    @Override
    public void getTotalAmountSoldBurgers() {

        System.out.println(getClass().getName() + ": Total amount of sold burgers: " + getlistSoldBurgers().size());
    }

    @Override
    public void getTotalPriceSoldBurgers() {
        int price = 0;
        for (Burger burger : getlistSoldBurgers()) {
            price += burger.getPrice();
        }
        System.out.println(getClass().getName() + ": Total price of sold burgers is $" + price);
    }

    @Override
    public void getTotalAmountRemainingBurgers() {

        System.out.println(getClass().getName() + ": Total amount of remaining burgers: " + getlistRemainingBurgers().size());
    }

    @Override
    public void getTotalPriceRemainingBurgers() {
        int price = 0;
        for (Burger burger : getlistRemainingBurgers()) {
            price += burger.getPrice();
        }
        System.out.println(getClass().getName() + ": Total price of remaining burgers is $" + price);
    }
}
