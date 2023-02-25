import Store.ChicagoStore;
import Store.NYPizzaStore;
import Store.PizzaStore;

public class main {
    public static void main(String[] args) {
        System.out.println();
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.order("cheese");
        System.out.println();
        PizzaStore pizzaStore2 = new ChicagoStore();
        pizzaStore2.order("veg");
        System.out.println();
    }
}
