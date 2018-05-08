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

    }

    public void takesBreak (int breakHrsPerWeek) {

    }
}