public class Bartender extends Employee implements primWork {

    public static int workHrsPerWeek = 20;
    public static int breakHrsPerWeek = 4;

    Bartender (String job, int workHrsPerWeek, int breakHrsPerWeek) {
        super (job, workHrsPerWeek, breakHrsPerWeek);
    }

    //methods

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".");
        System.out.println("I primarily serve cocktails.");
        System.out.println("I work aproximately "+workHrsPerWeek+" and take breaks for about "+breakHrsPerWeek);
    }
}