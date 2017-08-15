package task_2.entity;

/**
 * Created by Nazar on 09.08.2017.
 */
public enum Situation {
    ON_RIVERBANK("на березі річки"), ON_MUSHROOM_FIELDS("на грибній поляні"), SEE_BEAST("бачить звіра");

    String describe;

    Situation(String describe) {
        this.describe = describe;
    }

    public String getDiscribe(){
        if (this != null){
            return describe;
        }
        throw new RuntimeException("null situation argument!");
    }
}
