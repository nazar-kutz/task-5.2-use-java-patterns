package task_8.entity.components.oil;

import task_8.entity.components.Item;

/**
 * Created by Nazar on 14.08.2017.
 */
public class OliveOil extends Item{
    public OliveOil(int grams){
        setGrams(grams);
        setPrice(grams*0.1);
    }

    @Override
    public String getName() {
        return "оливкова олія";
    }
}
