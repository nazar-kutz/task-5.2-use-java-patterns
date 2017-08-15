package task_12.entity;

/**
 * Created by Nazar on 14.08.2017.
 */
public class PaperSheet {
    private String textOnSheet = "There is empty on the sheet";

    public void saveText(String text){
        if(text != null && !text.equals("")){
            textOnSheet = text;
        }
    }

    public void showSheet(){
        System.out.println(textOnSheet);
    }
}
