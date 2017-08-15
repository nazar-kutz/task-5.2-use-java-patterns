package task_8.entity.components.spice;

/**
 * Created by Nazar on 14.08.2017.
 */
public enum SpiceType {
    /*o	basil
    o	oregano
    o	paprika
    o	black pepper
*/

    BASIL("Базилік", 120),
    OREGANO("Орегано", 180),
    PAPRIKA("Паприка", 150),
    BLACK_PEPPER("Чорний перець", 120);

    String name;
    double priceForKilogram;

    SpiceType(String name, double priceForKilogram) {
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
