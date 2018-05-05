public class Pool extends Room implements rmCharacteristics {
    boolean heated;

    //constructor
    public Pool (String roomName, int height, int width, int length,String floorMaterial,String primaryPaintColor) {
        super(roomName, height, width, length, floorMaterial, primaryPaintColor);
    }

    public void roomCharacteristics () {
        System.out.println ("I am the pool named:  " + roomName);
    }
}