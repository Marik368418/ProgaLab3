package items;

import java.util.Objects;

public class Sound {
    private String name;
    private String description;

    public Sound(String name, String description){
        this.name = name;
        this.description = description;
    }
    public void sound(){
        System.out.println(" послышалось " + description + " " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sound sound = (Sound) o;
        return Objects.equals(name, sound.name) && Objects.equals(description, sound.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}

