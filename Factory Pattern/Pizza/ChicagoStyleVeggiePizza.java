package Pizza;
public class ChicagoStyleVeggiePizza extends Pizza{

    public ChicagoStyleVeggiePizza(){
        name = "Chicago Style Veggie Pizza";
        dough = "Thick Crust";
        sauce = "Hot Sauce";
    }

    public void cut(){
        System.out.println("Cutting the Chicago Pizzas in Square shape");
    }
    
}
