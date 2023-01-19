package items;

public class Preparations extends Thing {
    public Preparations(String name, String description) {
        super(name, description);
    }
    public void preparation(){
        System.out.print("На " + getDescription() + getName());
    }
}


