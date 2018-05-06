public class GuestRoom extends Room implements rmCharacteristics {

    String roomName;
    int numberOfBeds;
    boolean desk;
    int heightInFeet = 8, widthInFeet = 10, lengthInFeet = 20;

    //constructor
    public GuestRoom (String roomName) {
        super(roomName);
    }

    public void roomCharacteristics() {
        System.out.println("I am guest room number:  " + roomName);
        System.out.println("Dimensions are "+heightInFeet+"X"+widthInFeet+"X"+lengthInFeet);
        System.out.println("Flooring is " + floorMaterial + " and paint is "+primaryPaintColor);
    }
}