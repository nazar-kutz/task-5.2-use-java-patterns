package task_8;

import task_8.entity.Pizza;
import task_8.entity.components.cheese.CheeseType;
import task_8.entity.components.filling.FillingType;
import task_8.entity.components.sauce.SauceType;
import task_8.entity.components.spice.SpiceType;

/**
 * Created by Nazar on 13.08.2017.
 */
public class Main8 {
    public static void main(String[] args) {
        Pizza order = Pizza.getNewPizzaBuilder().addDough(200).addCheese(CheeseType.PARMESAN, 100).
                addFilling(FillingType.MEAT, 200).addSauce(SauceType.KETCHUP, 100).addSauce(SauceType.MAYONNAISE, 100).
                addSpice(SpiceType.BLACK_PEPPER, 100).makePizza();

        System.out.println(order);
    }
}
