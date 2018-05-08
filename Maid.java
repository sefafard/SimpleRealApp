public class Maid extends Employee implements primWork {

//constructor
     Maid (String job, int workHrsPerWeek) {
    super (job, workHrsPerWeek);
}
// methods
    public void makesBed () {

    }

    public void cleansBathroom () {
        
    }

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".  I work " + workHrsPerWeek +" hours per week.");
        System.out.println("I primarily clean the guest rooms.");
    }
}