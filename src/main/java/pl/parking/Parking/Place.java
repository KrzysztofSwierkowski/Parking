package pl.parking.Parking;



public class Place {

    private final String id;
    private final int number;
    private Type type;



    public Place(String id , int number, Type type) {
        this.id = id;
        this.number = number;
        this.type = type;
    }


    public String getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public Type getType() {
        return type;
    }

    public static enum Type{
        FREE, IsReserved;


    }

}
