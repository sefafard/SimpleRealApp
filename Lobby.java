public class Lobby extends Room implements rmCharacteristics {

    //constructor
    public Lobby (String roomName, int height, int width, int length,String floorMaterial,String primaryPaintColor) {
        super(roomName, height, width, length, floorMaterial, primaryPaintColor);
    }

    Bar bar1 = new Bar("Bar", 14, 22, 42, "Tile", "Maroon");

    public void roomCharacteristics () {
        System.out.println("I'm the Lobby");
    }

}