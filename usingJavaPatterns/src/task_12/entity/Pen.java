package task_12.entity;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Pen {
    public void writeText(PaperSheet sheet, String text){
        sheet.saveText(text);
    }
}
