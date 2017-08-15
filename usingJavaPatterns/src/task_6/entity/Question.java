package task_6.entity;

/**
 * Created by Nazar on 13.08.2017.
 */
public enum Question {
    SPEAK_TO_DIRECTOR ("поговорити з директором"),
    ASK_ABOUT_SALARY ("з'ясувати питання по зарплаті"),
    TAKE_UNIFORM ("взяти уніформу"),
    ASK_ABOUT_NEW_PROJECT ("питання по новому проекту");

    String describe;

    public String getDescribe() {
        return describe;
    }

    Question(String describe) {
        this.describe = describe;
    }
}
