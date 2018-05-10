public class Manager extends Employee implements primWork {

    public static int mgrWorkHrsPerWeek = 50;
    public static int mgrBreakHrsPerWeek = 10;

    Manager (String job, int workHrsPerWeek, int breakHrsPerWeek) {
        super (job, mgrWorkHrsPerWeek, mgrBreakHrsPerWeek);
        workHrsPerWeek = mgrWorkHrsPerWeek;
        breakHrsPerWeek = mgrBreakHrsPerWeek;
        // System.out.printf("Manager constructor for job %s with hrs/wk = %d and breakhrs = %d\n", job, workHrsPerWeek, breakHrsPerWeek);
    }

    // methods

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".");
        System.out.println("I primarily supervise others' work.");
        // System.out.println("I work aproximately "+workHrsPerWeek+" hours per week and am allowed breaks for up to "+breakHrsPerWeek+ " hours per week.");
    }
}