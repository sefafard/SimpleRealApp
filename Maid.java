public class Maid extends Employee implements primWork {

    static int maidWorkHrsPerWeek = 37;
    static int maidBreakHrsPerWeek = 8;

//constructor
 Maid (String job, int workHrsPerWeek, int breakHrsPerWeek) {
    super (job, maidWorkHrsPerWeek, maidBreakHrsPerWeek);
    workHrsPerWeek = maidWorkHrsPerWeek;
    breakHrsPerWeek = maidBreakHrsPerWeek;
    // System.out.printf("Maid constructor for job %s with hrs/wk = %d and breakhrs = %d\n", job, workHrsPerWeek, breakHrsPerWeek);
}
// methods

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".");
        System.out.println("I clean folks' rooms.");
        // System.out.println("I work aproximately "+workHrsPerWeek+" hours per week and am allowed breaks for up to "+breakHrsPerWeek+ " hours per week.");
    }
}