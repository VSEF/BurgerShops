import java.util.List;

public interface BurgerShop {

    void createdBurgers(Burger burger);

    void soldBurgers(Burger burger);

    List<Burger> getlistCreatedBurgers();
    List<Burger> getlistSoldBurgers();
    List<Burger> getlistRemainingBurgers();
    void getTotalAmountCreatedBurgers();
    void getTotalPriceCreatedBurgers();
    void getTotalAmountSoldBurgers();
    void getTotalPriceSoldBurgers();
    void getTotalAmountRemainingBurgers();
    void getTotalPriceRemainingBurgers();

}
