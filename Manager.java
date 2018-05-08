public class Manager extends Employee implements primWork {

    Manager (String job, int workHrsPerWeek) {
        super (job, workHrsPerWeek);
    }

    // methods

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".");
        System.out.println("I primarily supervise others' work.");
    }
}