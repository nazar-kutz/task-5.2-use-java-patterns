package task_8.entity.components.filling;

/**
 * Created by Nazar on 14.08.2017.
 */
public enum FillingType {
    MEAT("М'ясо", 80.0),
    FISH("Риба", 100.0),
    MUSHROOMS("Гриби", 350.0),
    VEGETABLES("Овочі", 180.0);

    String name;
    double priceForKilogram;

    FillingType(String name, double priceForKilogram) {
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
