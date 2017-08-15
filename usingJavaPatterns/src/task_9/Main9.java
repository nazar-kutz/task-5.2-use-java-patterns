package task_9;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Main9 {
    public static void main(String[] args) {
        Tipography tipography = new Tipography();

        tipography.addObserver(new Subscriber("Peter", LivingPlace.CITY));
        tipography.addObserver(new Subscriber("Andrew", LivingPlace.VILLAGE));
        tipography.addObserver(new Subscriber("Ann", LivingPlace.CITY));
        tipography.addObserver(new Subscriber("Victoria", LivingPlace.VILLAGE));
        tipography.addObserver(new Subscriber("Kate", LivingPlace.VILLAGE));
        tipography.addObserver(new Subscriber("John", LivingPlace.CITY));

        tipography.notifyObservers(LivingPlace.VILLAGE);
    }
}
