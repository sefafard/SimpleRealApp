public class Bartender extends Employee implements primWork {

    Bartender (String job, int workHrsPerWeek) {
        super (job, workHrsPerWeek);
    }

    //methods
    public void poursDrinks() {

    }
    public void cleansGlasses () {

    }

    public void cleansBar () {

    }

    public void primaryWork() {
        System.out.println("My job is:  "+ job +".  I work " + workHrsPerWeek +" hours per week.");
        System.out.println("I primarily serve cocktails.");
    }
}