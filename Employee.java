public abstract class Employee {

    String job;
    int workHrsPerWeek, breakHrsPerWeek;

    //constructor
    public Employee (String job, int workHrsPerWeek, int breakHrsPerWeek) {
        this.job = job;
        this.workHrsPerWeek = workHrsPerWeek;
        this.breakHrsPerWeek = breakHrsPerWeek;
    }

    //methods
    public void works() {
        System.out.println("Empployee abstract class job is: " +job+ ".  I work " +workHrsPerWeek +" hours per week and am allowed up to " +breakHrsPerWeek+ " for breaks.");
    }

    public void takesBreak (int breakHrsPerWeek) {
        System.out.println("I'm currently on break; I get " + breakHrsPerWeek +" break hours per week.");

    }
}