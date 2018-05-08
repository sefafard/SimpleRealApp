public class Maid extends Employee implements primWork {

//constructor
     Maid (String job, int workHrsPerWeek) {
    super (job, workHrsPerWeek);
}
// methods

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".");
        System.out.println("I primarily clean the guest rooms.");
    }
}