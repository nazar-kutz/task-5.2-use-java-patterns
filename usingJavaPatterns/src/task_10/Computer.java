package task_10;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Computer {
    private SVGA svga;

    public Computer(SVGA svga) {
        this.svga = svga;
    }

    public void transferInfoSignal(String information){
        svga.transferAnalogSignal(information);
    }
}
