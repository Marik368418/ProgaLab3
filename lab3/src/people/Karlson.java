package people;

import items.Thing;
import people.Person;

import java.util.Objects;

public class Karlson extends Person {
    private final String name = "Карлсон";

    @Override
    public void breathe(){
        System.out.print(name + " принялся вздыхать");
    }
    public void scream(Thing obj){
        System.out.println(" и стонать" + " на " + obj.toString());
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
        Karlson karlson = (Karlson) o;
        return Objects.equals(name, karlson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}

