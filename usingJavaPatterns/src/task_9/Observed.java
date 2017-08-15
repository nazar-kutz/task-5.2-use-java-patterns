package task_9;

/**
 * Created by Nazar on 14.08.2017.
 */
public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
