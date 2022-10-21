package Transports;

public class Car extends Transport {
    private String statusRefill;
    private final float engineVolume;

    public float getEngineVolume() {
        return engineVolume;
    }

    @Override
    protected void refill(Boolean gasoline, Boolean diesel, Boolean electro) {
        if (gasoline || diesel || electro) {
            statusRefill = "заправлен";
        } else {
            statusRefill = " не заправлен";
        }
    }

    public Car(String brand, String model, int yearOfRelease, String countryOfProduction, String color,
               float speedMax, float engineVolume) {
        super(brand, model, yearOfRelease, countryOfProduction, color, speedMax);
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "engineVolume=" + engineVolume + "} " + super.toString() + statusRefill;
    }
}