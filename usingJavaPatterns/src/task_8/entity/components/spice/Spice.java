package task_8.entity.components.spice;

import task_8.entity.components.Item;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Spice extends Item{
    private SpiceType spice;

    public Spice(SpiceType spice, int grams){
        this.spice = spice;
        setGrams(grams);
        setPrice((grams*spice.getPriceForKilogram())/1000);
    }

    @Override
    public String getName() {
        return spice.getName();
    }
}
