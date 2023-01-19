package people;

import interfaces.Feelings;
import items.Thing;

import java.util.Objects;

public abstract class Person implements Feelings {
    private String name;

    public void breathe() {
        System.out.println(name + " дышит");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }
}
