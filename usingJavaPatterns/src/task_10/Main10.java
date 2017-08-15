package task_10;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Main10 {
    public static void main(String[] args) {
        DVI dviMonitor = new Monitor();
        SVGA adaptor = new SvgaToDviAdaptor(dviMonitor);
        Computer computer = new Computer(adaptor);
        computer.transferInfoSignal("string to write");
    }
}
