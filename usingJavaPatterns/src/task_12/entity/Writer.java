package task_12.entity;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Writer {
    private Pen pen;
    private PaperSheet sheet;

    public Writer(Pen pen, PaperSheet sheet) {
        this.pen = pen;
        this.sheet = sheet;
    }

    public void write(String text){
        pen.writeText(sheet, text);
    }
}
