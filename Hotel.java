public class Hotel {
    String name;
    int numberOfGuestRooms;
    // Amenities
    String weightRoom, lobbyBar, pool;

    //constructor
    public Hotel (String name, int numberOfGuestRooms, String weightRoom, String lobbyBar, String pool) {
        this.name = name;
        this.numberOfGuestRooms = numberOfGuestRooms;
        this.weightRoom = weightRoom;
        this.lobbyBar = lobbyBar;
        this.pool = pool;
    }

    //create numberOfGuestRooms rooms
    public void buildRooms() {
    int i = 0, roomNo=0, height = 24, width = 10, length = 10;
    String newRoom = "", floor="Carpet", paint="White";
    GuestRoom room = null;
    
    for (i=0; i < numberOfGuestRooms; i++) {
        roomNo = 100 + i;
        room = new GuestRoom (String.valueOf(roomNo), height, width, length, floor, paint); //room number
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
        System.out.println("Pool: " + pool);
    }
}