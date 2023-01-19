package items;

import items.Thing;

public class Article extends Thing {

    public Article(String name, String description) {
        super(name, description);
    }

    public void telling() {
        System.out.print("В " + getName() + " говорилось что");}


}

