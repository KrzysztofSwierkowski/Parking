package pl.parking.Parking;



public class Place {

    private String id;
    private int number;
    private Type type;


    public String getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public Type getType() {
        return type;
    }

    public void setid (String id) {
        this.id = id;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public static enum Type{
        State, IsReserved
    }

}
