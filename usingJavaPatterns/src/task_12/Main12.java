package task_12;

import task_12.entity.PaperSheet;
import task_12.entity.Pen;
import task_12.entity.Writer;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Main12 {
    public static void main(String[] args) {
        Pen pen = new Pen();
        PaperSheet sheet = new PaperSheet();
        Writer writer = new Writer(pen, sheet);

        sheet.showSheet();

        writer.write("This is my message to you");
        sheet.showSheet();
    }
}
