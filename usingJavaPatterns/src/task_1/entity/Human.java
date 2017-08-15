package task_1.entity;

import task_1.entity.state.Fisher;
import task_1.entity.state.Hunter;
import task_1.entity.state.MushroomsGatherer;
import task_1.entity.state.State;

/**
 * Created by Nazar on 09.08.2017.
 */
public class Human {
    String name;
    Situation situation;
    State state;

    public Human(String name) {
        this.name = name;
    }

    public void setSituation(Situation situation) {
        if(situation != null){
            this.situation = situation;
        }
        setState();
    }

    private void setState() {
        switch (this.situation){
            case ON_RIVERBANK:
                this.state = new Fisher();
                break;
            case ON_MUSHROOM_FIELDS:
                this.state = new MushroomsGatherer();
                break;
            case SEE_BEAST:
                this.state = new Hunter();
                break;
            default:
                throw new RuntimeException("not correct situation!");
        }
    }

    public void action(){
        System.out.print(name + " " + situation.getDiscribe() + ", " + name + " ");
        state.action();
        System.out.println();
    }
}
