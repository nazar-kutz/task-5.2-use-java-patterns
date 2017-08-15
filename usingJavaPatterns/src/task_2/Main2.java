package task_2;

import task_2.entity.Human;
import task_2.entity.Situation;

/**
 * Created by Nazar on 09.08.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        Human human = new Human("Володя");
        human.action();

        human.addSituation(Situation.ON_RIVERBANK);
        human.action();

        human.addSituation(Situation.ON_MUSHROOM_FIELDS);
        human.action();

        human.addSituation(Situation.SEE_BEAST);
        human.action();
    }
}
