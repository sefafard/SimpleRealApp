public abstract class Room {
    int heightInFeet, widthInFeet, lengthInFeet;
    String floorMaterial, primaryPaintColor, roomName;    

    //constructor
    public Room (String roomName) {
        this.roomName = roomName;
    }

}