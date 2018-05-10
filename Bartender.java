public class Bartender extends Employee implements primWork {

    public static int barkeepWorkHrsPerWeek = 20;
    public static int barkeepBreakHrsPerWeek = 4;

    Bartender (String job, int workHrsPerWeek, int breakHrsPerWeek) {
        super (job, barkeepWorkHrsPerWeek, barkeepBreakHrsPerWeek);
        workHrsPerWeek = barkeepWorkHrsPerWeek;
        breakHrsPerWeek = barkeepBreakHrsPerWeek;
        // System.out.printf("Bartender constructor for job %s with hrs/wk = %d and breakhrs = %d\n", job, workHrsPerWeek, breakHrsPerWeek);
    }

    //methods

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".");
        System.out.println("I primarily serve cocktails.");
        // System.out.println("I work aproximately "+workHrsPerWeek+" hours per week and am allowed breaks for up to "+breakHrsPerWeek+ " hours per week.");
    }
}