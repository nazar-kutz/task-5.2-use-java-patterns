package task_6.entity;

/**
 * Created by Nazar on 13.08.2017.
 */
public class Secretary {
    public void directWorker(Employee employee){
        switch (employee.getQuestion()){
            case SPEAK_TO_DIRECTOR:
                System.out.println("секретар: ідіть до директора.");
                break;
            case ASK_ABOUT_SALARY:
                System.out.println("секретар: поговоріть з бухгалтером.");
                break;
            case TAKE_UNIFORM:
                System.out.println("секретар: візьміть на складі.");
                break;
            case ASK_ABOUT_NEW_PROJECT:
                System.out.println("секретар: поговоріть з менеджером.");
                break;
            default:
                System.out.println("секретар: не маю повноважнь!");
        }
    }
}
