public class Lobby extends Room implements rmCharacteristics {

    int heightInFeet = 24, widthInFeet = 20, lengthInFeet = 40;

    //constructor
    public Lobby (String roomName) {
        super(roomName);
    }

    Bar bar1 = new Bar("Bar");

    public void roomCharacteristics () {
        System.out.println("I am the:  " + roomName);
        System.out.println("Dimensions are "+heightInFeet+"X"+widthInFeet+"X"+lengthInFeet);
        System.out.println("Flooring is " + floorMaterial + " and paint is "+primaryPaintColor);
    }

}