package enums.ex2fields;

public enum Planet {
    MERCURY("Mercury", 0.39),
    VENUS("Venus", 0.72),
    EARTH("Earth", 1.0),
    MARS("Mars", 1.52);

    private final String name;
    private final double distaceFromSun;

    Planet(String name, double distaceFromSun) {
        this.name = name;
        this.distaceFromSun = distaceFromSun;
    }

    public String getName() {
        return name;
    }

    public double getDistaceFromSun() {
        return distaceFromSun;
    }
}
