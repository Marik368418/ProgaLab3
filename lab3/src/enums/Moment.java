package enums;

public enum Moment {

    suddenly("Вдруг"),
    firstly("сперва"),
    lately(" на днях"),
    immediately(" сразу");

    private String name;

    Moment(String s) {
        this.name = s;
    }
    @Override
    public String toString(){
        return name;
    }
}