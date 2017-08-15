package task_8.entity.components;

/**
 * Created by Nazar on 13.08.2017.
 */
public abstract class Item {
    private int grams;
    private double price;

    public int getGrams() {
        return grams;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getName();

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
