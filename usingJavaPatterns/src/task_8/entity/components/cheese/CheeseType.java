package task_8.entity.components.cheese;

/**
 * Created by Nazar on 14.08.2017.
 */
public enum CheeseType {
    BRIE("сир \"Брі\"", 95.0),
    EMMENTAL("сир \"Ементаль\"", 110.0),
    ADYGHE("сир \"Адигейський\"", 50.0),
    PARMESAN("сир \"Пармезан\"", 140.0),
    CAMEMBERT("сир \"Чамберт\"", 85.0),
    FETA("сир \"Фета\"", 95.0),
    CHEDDAR("сир \"Чедр\"", 150.0);

    String name;
    double priceForKilogram;

    CheeseType(String name, double priceForKilogram) {
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
