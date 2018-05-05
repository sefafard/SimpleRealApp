public abstract class Room {
    int height, width, length;
    String floorMaterial;
    String primaryPaintColor;
    String roomName;

    //constructor
    public Room (String roomName, int height, int width,int length,String floorMaterial,String primaryPaintColor) {
        this.roomName = roomName;
        this.height = height;
        this.width = width;
        this.length = length;
        this.floorMaterial = floorMaterial;
        this.primaryPaintColor = primaryPaintColor;
    }

}