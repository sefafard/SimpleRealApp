public class HotelPool extends Room implements rmCharacteristics {
    boolean heated;
    int heightInFeet = 10, widthInFeet = 20, lengthInFeet = 60;
    String floorMaterial = "tile", primaryPaintColor = "blue";

    //constructor
    public HotelPool (String roomName) {
        super(roomName);
    }

    public void roomCharacteristics () {
        System.out.println("I am the:  " + roomName);
        System.out.println("Dimensions are "+heightInFeet+"X"+widthInFeet+"X"+lengthInFeet);
        System.out.println("Flooring is " + floorMaterial + " and paint is "+primaryPaintColor);
    }
}