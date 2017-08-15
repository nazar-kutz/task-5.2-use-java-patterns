package task_11;

/**
 * Created by Nazar on 14.08.2017.
 */
public class HDD {
    private MB mb;
    private String textInfoInHDD = "hello world!";

    public HDD(MB mb) {
        this.mb = mb;
    }

    public String readInformation(){
        mb.getVideoCard().printInfo("Read info from HDD...");
        return textInfoInHDD;
    }

    public void writeInformation(String textInfo){
        mb.getVideoCard().printInfo("Write info into HDD...");
        this.textInfoInHDD = textInfo;
    }
}
