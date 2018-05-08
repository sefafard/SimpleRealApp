public abstract class Employee {

    String job;
    int workHrsPerWeek, breakHrsPerWeek;

    //constructor
    public Employee (String job, int workHrsPerWeek) {
        this.job = job;
        this.workHrsPerWeek = workHrsPerWeek;
    }

    //methods
    public void works(int workHrsPerWeek) {
        System.out.println("I work " +workHrsPerWeek +" hours per weeek.");
    }

    public void takesBreak (int breakHrsPerWeek) {

    }
}