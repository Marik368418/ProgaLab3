package items;

import java.util.Objects;
public class Thing{
    private String name;
    private String description;
    public Thing(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Thing(String name){
        this.name = name;
        this.description = "";
    }
    @Override
    public String toString() {
        return "thing: " + description + " " + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Thing thing = (Thing) obj;
        return Objects.equals(name, thing.name) && Objects.equals(description, thing.description);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
