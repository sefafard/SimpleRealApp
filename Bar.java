public class Bar extends Room implements rmCharacteristics {

    int heightInFeet = 24, widthInFeet = 18, lengthInFeet = 28;
    String floorMaterial = "tile", primaryPaintColor = "Black";;

    //constructor
    public Bar (String roomName) {
        super(roomName);
    }

    //methods
    public void roomCharacteristics () {
        System.out.println("I am the:  " + roomName);
        System.out.println("Dimensions are "+heightInFeet+"X"+widthInFeet+"X"+lengthInFeet);
        System.out.println("Flooring is " + floorMaterial + " and paint is "+primaryPaintColor);

    }
    
}