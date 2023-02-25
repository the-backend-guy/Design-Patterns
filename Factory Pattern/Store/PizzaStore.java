package Store;
import Pizza.Pizza;

public abstract class PizzaStore {
    
    Pizza pizza;

    public void order(String type){
        pizza = create(type);
        System.out.println("Making a pizza : " + pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza create(String type);

}
