package Pizza;

import Cheese.Cheese;
import Dough.Dough;

public abstract class Pizza {

    String name;
    Dough dough;
    Cheese cheese;
    
    public void prepare(){
        System.out.println("Preparing Pizza : " + name);
        System.out.println("Tossing Dough");
        System.out.println("Adding Sauce");
    };

    public void bake(){
        System.out.println("Baking Pizza");
    }

    public void cut(){
        System.out.println("Cutting Pizza");
    }
    
    public void box(){
        System.out.println("Boxing Pizza");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
