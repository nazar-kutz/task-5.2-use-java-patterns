package task_8.entity.components.dough;

import task_8.entity.components.Item;

/**
 * Created by Nazar on 13.08.2017.
 */
public class Dough extends Item {
    private int DOUGH_PRICE_FOR_100_GRAMS = 15;
    public Dough(int grams) {
        setGrams(grams);
        setPrice((double)(grams * DOUGH_PRICE_FOR_100_GRAMS) / 100);
    }

    @Override
    public String getName() {
        return "Тісто";
    }

    @Override
    public String toString() {
        return getName();
    }
}
