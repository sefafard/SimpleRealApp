public class WeightRoom extends Room implements rmCharacteristics {
    int heightInFeet = 10, widthInFeet = 20, lengthInFeet = 60;
    String floorMaterial = "cork", primaryPaintColor = "Mauve";
    boolean freeWeights, cardio, cableMachines;

    //constructor
    WeightRoom  (String roomName){ 
        super(roomName);
    }

    public void roomCharacteristics () {
        System.out.println("I am the " + roomName);
        System.out.println("Dimensions are "+heightInFeet+"X"+widthInFeet+"X"+lengthInFeet);
        System.out.println("Flooring is " + floorMaterial + " and paint is "+primaryPaintColor);
        if (freeWeights) {
            System.out.println ("we have free weights");
        }
        if (cardio) {
            System.out.println ("we have cardio");
        }
        if (cableMachines) {
            System.out.println ("we have cable machines");
        }
    }
}