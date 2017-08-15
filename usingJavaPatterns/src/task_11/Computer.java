package task_11;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Computer {
    private MB mb;

    public Computer(MB bm) {
        this.mb = bm;
    }

    public void readAndTransferInfo(){
        mb.getProcessor().transferInfo();
    }

    public void switchOn(){
        mb.getVideoCard().printInfo("Switch on the computer");
    }

    public void doProcess(){
        mb.getRam().load(mb.getHdd());
        mb.getVideoCard().printInfo("information into HDD: \"" + mb.getRam().getRAMloadedInfo() + "\"");
        readAndTransferInfo();
        mb.getRam().load(mb.getHdd());
        mb.getVideoCard().printInfo("information into HDD: " + mb.getRam().getRAMloadedInfo());
    }
}
