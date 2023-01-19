package people;

import interfaces.Went;
import people.Person;

import java.util.Objects;

public class Mother extends Person implements Went {

    private final String name = " мама ";

    @Override
    public void went(){
        System.out.print(" что" + name);
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
        Mother mother = (Mother) o;
        return Objects.equals(name, mother.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
