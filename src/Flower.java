public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private float cost;
    private int lifeSpan;

    public Flower(String name, String flowerColor, String country, float cost, int lifeSpan) {
        this.name = name;
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            flowerColor = "белый";
        }
        this.flowerColor = flowerColor;
        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "Россия";
        }
        this.country = country;
        if (cost <= 0) {
            cost = 1;
        }
        this.cost = cost;
        if (lifeSpan <= 0) {
            lifeSpan = 3;
        }
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan < 0) {
            throw new IllegalArgumentException(" некоректные данные");
        }
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return name + " цвет " + flowerColor +
                ", страна происхождения " + country  +
                ", стоимость = " + cost +
                ", срок стояния " + lifeSpan;
    }
}
