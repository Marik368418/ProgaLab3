package enums;

public enum SizeEnum {
    TOMUCH("очень много"), ALOT("немало");
    String runame;
    SizeEnum(String s){
        runame = s;
    }
    @Override
    public String toString(){
        return runame;
    }


}
