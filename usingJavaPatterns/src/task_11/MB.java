package task_11;

/**
 * Created by Nazar on 14.08.2017.
 */
public class MB {
    private HDD hdd = new HDD(this);
    private RAM ram = new RAM(this);
    private Processor processor = new Processor(this);
    private VideoCard videoCard = new VideoCard(this);

    public HDD getHdd() {
        return hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }
}
