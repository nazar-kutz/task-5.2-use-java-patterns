package task_1.entity.state;

/**
 * Created by Nazar on 09.08.2017.
 */
public class Fisher implements State {
    @Override
    public void action() {
        System.out.print("ловить рибу!");
    }
}
