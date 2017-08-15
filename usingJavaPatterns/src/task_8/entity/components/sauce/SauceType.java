package task_8.entity.components.sauce;

/**
 * Created by Nazar on 14.08.2017.
 */
public enum SauceType {
    KETCHUP("Кетчуп", 200),
    TOMATO_SAUCE("Томатний соус", 250.0),
    MAYONNAISE("Майонез", 500.0);

    String name;
    double priceForKilogram;

    SauceType(String name, double priceForKilogram) {
        this.name = name;
        this.priceForKilogram = priceForKilogram;
    }

    public String getName() {
        return name;
    }

    public double getPriceForKilogram() {
        return priceForKilogram;
    }
}
