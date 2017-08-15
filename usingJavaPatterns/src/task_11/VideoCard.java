package task_11;

/**
 * Created by Nazar on 14.08.2017.
 */
public class VideoCard {
    private MB mb;

    public VideoCard(MB mb) {
        this.mb = mb;
    }

    public void printInfo(String info){
        System.out.println("vc: " + info);
    }
}
