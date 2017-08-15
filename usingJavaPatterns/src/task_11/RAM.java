package task_11;

/**
 * Created by Nazar on 14.08.2017.
 */
public class RAM {
    private MB mb;
    private String RAMloadedInfo;

    public RAM(MB mb) {
        this.mb = mb;
    }

    public void load(HDD hdd){
        mb.getVideoCard().printInfo("Loading information from HDD into RAM...");
        RAMloadedInfo = hdd.readInformation();
    }

    public String getRAMloadedInfo() {
        return RAMloadedInfo;
    }
}
