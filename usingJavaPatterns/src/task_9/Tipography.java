package task_9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Tipography implements Observed{
    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subscribers){
            observer.handleEvent();
        }
    }

    public void notifyObservers(LivingPlace livingPlace) {
        for(Observer observer : subscribers){
            if(livingPlace.equals(observer.getLivingPlace())){
                observer.handleEvent();
            }
        }
    }
}
