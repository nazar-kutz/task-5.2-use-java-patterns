package task_2.entity;

import task_2.entity.state.Fisher;
import task_2.entity.state.Hunter;
import task_2.entity.state.MushroomsGatherer;
import task_2.entity.state.State;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nazar on 09.08.2017.
 */
public class Human {
    String name;
    List<Situation> situations = new ArrayList<>();
    List<State> states = new ArrayList<>();

    public Human(String name) {
        this.name = name;
    }

    public void addSituation(Situation situation) {
        if(situation != null){
            situations.add(situation);
        }
        addState(situation);
    }

    private void addState(Situation situation) {
        switch (situation){
            case ON_RIVERBANK:
                states.add(new Fisher());
                break;
            case ON_MUSHROOM_FIELDS:
                states.add(new MushroomsGatherer());
                break;
            case SEE_BEAST:
                states.add(new Hunter());
                break;
            default:
                throw new RuntimeException("not correct situation!");
        }
    }

    public void action(){
        StringBuilder stringBuilder = new StringBuilder(name).append(" ");
        if(states.size() > 0){
            int i = 0;
            for (; i < states.size() - 1; i++) {
                stringBuilder.append(situations.get(i).getDiscribe()).append(" і ");
            }
            stringBuilder.append(situations.get(i).getDiscribe()).append(". ");
            System.out.print(stringBuilder.toString());
            for(State state : states){
                state.action();
            }
        }
        else {
            System.out.print(name + " вдома!");
        }
        System.out.println();
    }
}
