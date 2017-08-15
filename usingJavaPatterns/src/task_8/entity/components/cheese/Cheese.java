package task_8.entity.components.cheese;

import task_8.entity.components.Item;

/**
 * Created by Nazar on 14.08.2017.
 */
public class Cheese extends Item{
    private CheeseType cheese;

    public Cheese(CheeseType cheese, int grams){
        this.cheese = cheese;
        setGrams(grams);
        setPrice((grams*cheese.getPriceForKilogram())/1000);
    }

    @Override
    public String getName() {
        return cheese.getName();
    }
}
