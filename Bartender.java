public class Bartender extends Employee implements primWork {

    Bartender (String job, int workHrsPerWeek) {
        super (job, workHrsPerWeek);
    }

    //methods

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".");
        System.out.println("I primarily serve cocktails.");
    }
}