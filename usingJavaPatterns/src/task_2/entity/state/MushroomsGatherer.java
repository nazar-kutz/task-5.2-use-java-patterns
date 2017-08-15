package task_2.entity.state;

/**
 * Created by Nazar on 09.08.2017.
 */
public class MushroomsGatherer implements State {

    @Override
    public void action() {
        System.out.print("Збирає гриби! ");
    }
}
