package people;

import enums.Moment;
import people.Person;

import java.util.Objects;

public class Baby extends Person {

    private final String name = "Малыш";
    @Override
    public void think(){
        System.out.print(name + " подумал");
    }
    @Override
    public void see(){
        System.out.print(Moment.suddenly +  " " + name + " увидел ");
    }
    @Override
    public void understand(){
        System.out.print(name + Moment.immediately + " понял ");
    }
    @Override
    public void remember(){
        System.out.print(name + " вспомнил");
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
        Baby baby = (Baby) o;
        return Objects.equals(name, baby.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
