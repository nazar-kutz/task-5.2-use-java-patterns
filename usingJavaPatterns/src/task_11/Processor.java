package task_11;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Processor {
    private MB mb;

    public Processor(MB mb) {
        this.mb = mb;
    }

    public String toUperCase(String info){
        mb.getVideoCard().printInfo("transfer info into processor...");
        return info.toUpperCase();
    }

    public void transferInfo(){
        mb.getRam().load(mb.getHdd());
        String valueAfterTransfer = toUperCase(mb.getRam().getRAMloadedInfo());
        mb.getHdd().writeInformation(valueAfterTransfer);
    }
}
