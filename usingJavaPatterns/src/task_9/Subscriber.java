package task_9;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Subscriber implements Observer {
    private String name;
    private LivingPlace livingPlace;

    public Subscriber(String name, LivingPlace livingPlace) {
        this.name = name;
        this.livingPlace = livingPlace;
    }

    public LivingPlace getLivingPlace() {
        return livingPlace;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleEvent() {
        System.out.println(name + ": I'm from " + livingPlace.getDescribe() + ". I've got a newspaper!");
    }
}
