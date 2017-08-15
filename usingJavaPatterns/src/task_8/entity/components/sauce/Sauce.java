package task_8.entity.components.sauce;

import task_8.entity.components.Item;
import task_8.entity.components.cheese.CheeseType;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Sauce extends Item {
    private SauceType sauce;

    public Sauce(SauceType sauce, int grams){
        this.sauce = sauce;
        setGrams(grams);
        setPrice((grams*sauce.getPriceForKilogram())/1000);
    }

    @Override
    public String getName() {
        return sauce.getName();
    }
}
