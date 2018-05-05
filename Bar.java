public class Bar extends Room implements rmCharacteristics {

    //constructor
    public Bar (String roomName, int height, int width, int length,String floorMaterial,String primaryPaintColor) {
        super(roomName, height, width, length, floorMaterial, primaryPaintColor);
    }

    //methods
    public void roomCharacteristics () {
        System.out.println ("I'm the bar");

    }
    
}