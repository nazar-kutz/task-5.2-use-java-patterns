package task_6.entity;

/**
 * Created by Nazar on 13.08.2017.
 */
public class Employee {
    private Question question = Question.SPEAK_TO_DIRECTOR;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void showQuestion(){
        System.out.println("співробітник: " + question.getDescribe());
    }
}
