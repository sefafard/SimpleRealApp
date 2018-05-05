public class WeightRoom extends Room implements rmCharacteristics {
    boolean freeWeights, cardio, cableMachines;

    //constructor
    WeightRoom  (String roomName, int height, int width, int length,String floorMaterial,String primaryPaintColor) {
        super(roomName, height, width, length, floorMaterial, primaryPaintColor);
    }

    public void roomCharacteristics () {
        System.out.println("I am the weight room named:  " + roomName);
        System.out.println("Dimensions are "+height+"X"+width+"X"+length);
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