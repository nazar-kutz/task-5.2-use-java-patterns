package task_9;

/**
 * Created by Nazar on 14.08.2017.
 */
public enum LivingPlace {
    CITY    ("city"),
    VILLAGE ("village");

    String describe;

    LivingPlace(String describe) {
        this.describe = describe;
    }

    public String getDescribe() {
        return describe;
    }
}
