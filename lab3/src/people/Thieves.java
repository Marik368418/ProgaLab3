package people;

import enums.Moment;
import enums.PlaceEnum;
import enums.SizeEnum;
import items.Box;
import items.Thing;
import people.Person;

import java.util.Objects;

public class Thieves extends Person {

    private final String name = "воры";

    public void pushThrough(Thing obj, Box obj2){
        System.out.println("как в "+ obj2.toString() + name + " просовывают " + obj.toString() );
    }
    public void climb(){
        System.out.println("что лезут " + name);

    }
    public void appearing(){
        System.out.println(" в " + PlaceEnum.City + " появилось " + SizeEnum.TOMUCH + " " + name);
    }
    public void call(Thing obj) {
        System.out.println(name +" " + Moment.firstly + " звонят по " + obj.getName());
    }
    public void hacking(Thing obj){
        System.out.print(name + " взламывают" + obj.toString() );
    }
    public void endure(){
        System.out.println(" и выносят из " + PlaceEnum.Flat + " ценное");
    }
    public void beSure(){
        System.out.print("Убедившись что " + PlaceEnum.Home + " никого нет ");
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
        Thieves thieves = (Thieves) o;
        return Objects.equals(name, thieves.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
