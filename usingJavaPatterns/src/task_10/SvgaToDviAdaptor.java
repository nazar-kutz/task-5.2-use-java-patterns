package task_10;

/**
 * Created by Nazar on 14.08.2017.
 */
public class SvgaToDviAdaptor implements SVGA{
    private DVI dvi;

    public SvgaToDviAdaptor(DVI dvi) {
        this.dvi = dvi;
    }

    @Override
    public void transferAnalogSignal(String information) {
        dvi.printInfo(information);
    }
}
