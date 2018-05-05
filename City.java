public class City {

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
        } else {
            System.out.println("Usage is:  <command> Name, num rooms, poolYN, weightsYN, barYN");
            return;
        }
    }
}