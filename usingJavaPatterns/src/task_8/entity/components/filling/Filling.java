package task_8.entity.components.filling;

import task_8.entity.components.Item;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Filling extends Item{
    private FillingType filling;

    public Filling(FillingType filling, int grams){
        this.filling = filling;
        setGrams(grams);
        setPrice((grams*filling.getPriceForKilogram())/1000);
    }

    @Override
    public String getName() {
        return filling.getName();
    }
}
