package task_11;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Main11 {
    public static void main(String[] args) {
        Computer computer = new Computer(new MB());
        computer.switchOn();
        computer.doProcess();
    }
}
