package task_6;

import task_6.entity.Employee;
import task_6.entity.Question;
import task_6.entity.Secretary;

/**
 * Created by Nazar on 13.08.2017.
 */
public class Main6 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Secretary secretary = new Secretary();

        employee.setQuestion(Question.SPEAK_TO_DIRECTOR);
        employee.showQuestion();
        secretary.directWorker(employee);
        System.out.println();

        employee.setQuestion(Question.ASK_ABOUT_SALARY);
        employee.showQuestion();
        secretary.directWorker(employee);
        System.out.println();

        employee.setQuestion(Question.TAKE_UNIFORM);
        employee.showQuestion();
        secretary.directWorker(employee);
        System.out.println();

        employee.setQuestion(Question.ASK_ABOUT_NEW_PROJECT);
        employee.showQuestion();
        secretary.directWorker(employee);
        System.out.println();
    }
}
