package people;

import enums.Moment;
import enums.PlaceEnum;
import interfaces.Went;
import items.Article;
import people.Person;

import java.util.Objects;

public class Father extends Person implements Went {
    private final String name = " папа";

    @Override
    public void went(){
        System.out.println("и" + name + " возвращаются " + PlaceEnum.Home);
    }

    public void read(Mother obj, Article obj2){
        System.out.println(" что" + Moment.lately + name + " читал" + obj.toString() + obj2.toString());
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
        Father father = (Father) o;
        return Objects.equals(name, father.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}

