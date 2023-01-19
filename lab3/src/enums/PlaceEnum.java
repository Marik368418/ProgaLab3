package enums;

public enum PlaceEnum {

    Area("лестничная площадка"),
    Home("дом"),
    City("город"),
    Flat("квартира");

    private final String name;

    PlaceEnum(String s){
        name = s;
    }

    @Override
    public String toString(){
        return name;
    }
}
