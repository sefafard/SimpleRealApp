public class Manager extends Employee implements primWork {

    public static int workHrsPerWeek = 50;
    public static int breakHrsPerWeek = 10;

    Manager (String job) {
        super (job);
    }

    // methods

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".");
        System.out.println("I primarily supervise others' work.");
        System.out.println("workHrsPerWeek value ="+workHrsPerWeek+" and break is "+breakHrsPerWeek);
    }
}