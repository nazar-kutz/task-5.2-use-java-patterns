package task_8.entity;

import task_8.entity.components.Item;
import task_8.entity.components.cheese.Cheese;
import task_8.entity.components.cheese.CheeseType;
import task_8.entity.components.dough.Dough;
import task_8.entity.components.filling.Filling;
import task_8.entity.components.filling.FillingType;
import task_8.entity.components.oil.OliveOil;
import task_8.entity.components.sauce.Sauce;
import task_8.entity.components.sauce.SauceType;
import task_8.entity.components.spice.Spice;
import task_8.entity.components.spice.SpiceType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nazar on 13.08.2017.
 */
public class Pizza {
    private List<Item> pizzaComponents = new ArrayList<>();
    private int summaryPrice;

    private Pizza(List<Item> pizzaComponents, int summaryPrice) {
        this.pizzaComponents = pizzaComponents;
        this.summaryPrice = summaryPrice;
    }

    public static PizzaBuilder getNewPizzaBuilder(){
        return new PizzaBuilder();
    }

    public static class PizzaBuilder{
        private List<Item> pizzaComponents = new ArrayList<>();
        private int summaryPrice;

        public PizzaBuilder addDough(int grams){
            pizzaComponents.add(new Dough(grams));
            return this;
        }


        public PizzaBuilder addCheese(CheeseType cheeseType, int grams){
            pizzaComponents.add(new Cheese(cheeseType, grams));
            return this;
        }

        public PizzaBuilder addFilling(FillingType fillingType, int grams){
            pizzaComponents.add(new Filling(fillingType, grams));
            return this;
        }

        public PizzaBuilder addOliveOli(int grams){
            pizzaComponents.add(new OliveOil(grams));
            return this;
        }

        public PizzaBuilder addSauce(SauceType sauceType, int grams){
            pizzaComponents.add(new Sauce(sauceType, grams));
            return this;
        }

        public PizzaBuilder addSpice(SpiceType spiceType, int grams){
            pizzaComponents.add(new Spice(spiceType, grams));
            return this;
        }

        public Pizza makePizza(){
            for(Item pizzaComponent : pizzaComponents){
                summaryPrice += pizzaComponent.getPrice();
            }

            return new Pizza(pizzaComponents, summaryPrice);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Піцца\n");
        if(pizzaComponents.size() > 0){
            stringBuilder.append("=========================================");
            stringBuilder.append('\n');
            stringBuilder.append("***ІНГРЕДІЄНТИ***");
            for(Item pizzaComponent : pizzaComponents){
                stringBuilder.append(pizzaComponent.getName()).append(", ").append(pizzaComponent.getGrams()).
                        append(" грам, ціна: ").append(pizzaComponent.getPrice()).append(" грн;\n");
            }
            stringBuilder.append("=========================================");
            stringBuilder.append('\n');
            stringBuilder.append("всього: ").append(summaryPrice).append(" грн.");
        }
        return stringBuilder.toString();
    }
}
