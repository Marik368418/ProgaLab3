package items;

import enums.SizeEnum;

public class Time extends Thing {

    public Time(String name) {
        super(name);
    }

    public void goingtime() {
        System.out.println(" ушло " + SizeEnum.ALOT.toString() + this.toString() + " ");
    }


}
