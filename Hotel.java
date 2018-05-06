public class Hotel {
    String name;
    int numberOfGuestRooms;
    // Amenities
    String weightRoom, lobbyBar, swimmingPool;

    //constructor
    public Hotel (String name, int numberOfGuestRooms, String weightRoom, String lobbyBar, String swimmingPool) {
        this.name = name;
        this.numberOfGuestRooms = numberOfGuestRooms;
        this.weightRoom = weightRoom;
        this.lobbyBar = lobbyBar;
        this.swimmingPool = swimmingPool;
    }

    //methods
    public static void main (String[] args){
        int ac;
        if (args.length == 5) {
            // echo args
            System.out.print("Command line args: ");
            for (ac=0; ac < args.length; ac++) {
                System.out.print (args[ac] + " ");
            }
            System.out.println(" ");
            int result = Integer.parseInt(args[1]);
            Hotel hotel1 = new Hotel(args[0], result, args[2], args[3], args[4]);
            hotel1.listInfo();
            hotel1.buildRooms();
            if (args[2].equals("Yes")) {
                WeightRoom wr = new WeightRoom("Weight room");
                wr.roomCharacteristics();
            }
            if (args[3].equals("Yes")) {
                Bar bar = new Bar("Bar");
                bar.roomCharacteristics();
            }
            if (args[4].equals("Yes")) {
                HotelPool swimmingPool = new HotelPool("Pool");
                swimmingPool.roomCharacteristics();
            }

        } else {
            System.out.println("Usage is:  <command> Hotel name, num rooms, weoghtroomYN, barYN, poolYN");
            return;
        }
    }

    //create numberOfGuestRooms rooms
    public void buildRooms() {
    int i = 0, roomNo=0; 
    String newRoom = "";
    GuestRoom room = null;
    
    for (i=0; i < numberOfGuestRooms; i++) {
        roomNo = 100 + i + 1;  //gotta start with room #1
        room = new GuestRoom (String.valueOf(roomNo)); //room number
        newRoom = newRoom + " " + String.valueOf(roomNo);
        System.out.println(roomNo + " " + room.roomName);
        }

        System.out.print("Created room numbers: ");
        System.out.println(newRoom);
    
        for (i=0; i < numberOfGuestRooms; i++) {
        //    System.out.println(room[i].roomName);
        // System.out.println(i);
        }
    
    }

    public void listInfo() {
        System.out.println("We are the famous " + name + " hotel");
        System.out.println("We have " + numberOfGuestRooms + " rooms.");
        System.out.println("WeightRoom: " + weightRoom);
        System.out.println("Lobby Bar: " + lobbyBar);
        System.out.println("Pool: " + swimmingPool);
    }
}