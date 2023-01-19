package people;

import enums.PlaceEnum;

import java.util.Objects;

public class They extends Person {
    private final String name = "они";

    public void stay(){
        System.out.print("Когда " + name + " стояли ");
    }
    public void goingOut(){
        System.out.print(" и собирались выйти на " + PlaceEnum.Area);
    }
    public void scare(Person obj){
        System.out.print(" чтобы пугать " + obj.toString() );
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        They they = (They) o;
        return Objects.equals(name, they.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
