package task_1;

import task_1.entity.Human;
import task_1.entity.Situation;

/**
 * Created by Nazar on 09.08.2017.
 */
public class Main1 {
    public static void main(String[] args) {
        Human human = new Human("Володя");

        human.setSituation(Situation.ON_RIVERBANK);
        human.action();

        human.setSituation(Situation.ON_MUSHROOM_FIELDS);
        human.action();

        human.setSituation(Situation.SEE_BEAST);
        human.action();
    }
}
