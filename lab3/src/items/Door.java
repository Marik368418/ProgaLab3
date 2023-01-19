package items;

import items.Thing;

public class Door extends Thing {
    public Door(String name, String description){
        super(name, description);
    }
    public void open(){
        System.out.print("перед " + this.toString());
    }


}

