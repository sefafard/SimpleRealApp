public class Maid extends Employee implements primWork {

    static int workHrsPerWeek = 37;
    static int breakHrsPerWeek = 8;

//constructor
     Maid (String job) {
    super (job);
}
// methods

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".");
        System.out.println("I primarily supervise others' work.");
        System.out.println("workHrsPerWeek value ="+workHrsPerWeek+" and break is "+breakHrsPerWeek);
    }
}