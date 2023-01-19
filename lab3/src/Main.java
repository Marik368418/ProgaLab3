import items.*;
import people.*;
public class Main {
    public static void main(String[] args) {
        Karlson karlson = new Karlson();
        karlson.breathe();
        Thing lad = new Thing("лад", "разные");
        karlson.scream(lad);
        Preparations preparations = new Preparations("приготовления", "все ");
        preparations.preparation();
        Time time = new Time("время");
        time.goingtime();
        Door door = new Door("дверь","входная");
        They they = new They();
        they.stay();
        door.open();
        they.goingOut();
        Passer passer = new Passer();
        they.scare(passer);
        Sound sound = new Sound("царапанье", "слабое");
        sound.sound();
        Baby baby = new Baby();
        baby.think();
        Father father = new Father();
        Mother mother = new Mother();
        mother.went();
        father.went();
        baby.see();
        Thing wire = new Thing("проволка","стальная");
        Thieves thieves = new Thieves();
        Box box = new Box("ящик"," с щелью для писем ");
        thieves.pushThrough(wire, box);
        baby.understand();
        thieves.climb();
        baby.remember();
        Article article = new Article("статья","газетная");
        father.read(mother, article);
        article.telling();
        thieves.appearing();
        Thing phone = new Thing("телефон");
        thieves.call(phone);
        Thing lock = new Thing("замок");
        thieves.beSure();
        thieves.hacking(lock);
        thieves.endure();
    }
}