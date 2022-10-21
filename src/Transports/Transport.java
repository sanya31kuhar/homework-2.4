package Transports;

public abstract class Transport {
    private String brand;
    private String model;
    private int yearOfRelease;
    private String countryOfProduction;
    private String color;
    private float speedMax;

    public Transport(String brand, String model, int yearOfRelease, String ofProduction, String countryOfProduction, float speedMax, String color) {
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        } else {
            this.color = "Цвет не указан";
        }
    }

    public void setSpeedMax(float speedMax) {
        if (speedMax <= 0) {
            speedMax = 100;
        } else {
            this.speedMax = speedMax;
        }
    }

    public Transport(String brand, String model, int yearOfRelease, String countryOfProduction, String color, float speedMax) {
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.countryOfProduction = countryOfProduction;
        this.color = color;
        this.speedMax = speedMax;
        ;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOut() {
        return yearOfRelease;
    }

    public String getCountry() {
        return countryOfProduction;
    }

    public String getColor() {
        return color;
    }

    public float getSpeedMax() {
        return speedMax;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", countryOfProduction='" + countryOfProduction + '\'' +
                ", color='" + color + '\'' +
                ", speedMax=" + speedMax +
                '}';
    }

    protected abstract void refill(Boolean gasoline, Boolean diesel, Boolean electro);

}





