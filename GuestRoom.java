public class GuestRoom extends Room implements rmCharacteristics {

    String roomName;
    int numberOfBeds;
    boolean desk;

    //constructor
    public GuestRoom (String roomName, int height, int width, int length,String floorMaterial,String primaryPaintColor) {
        super(roomName, height, width, length, floorMaterial, primaryPaintColor);
    }

    public void roomCharacteristics() {
        System.out.println ("I am Guestroom - number" + roomName);
    }
}