public class Manager extends Employee implements primWork {

    Manager (String job, int workHrsPerWeek) {
        super (job, workHrsPerWeek);
    }

    // methods
    static void planWork() {

    }
    
    static void doesWork() {

    }

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".  I work " + workHrsPerWeek + " hours per week.");
        System.out.println("I primarily supervise others' work.");
    }
}