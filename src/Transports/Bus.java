package Transports;

public class Bus extends Transport {
    private String spec;
    private String statusRefill;

    public Bus(String brand, String model, int yearOfRelease, String countryOfProduction, String color, float speedMax,
               String statusRefill) {
        super(brand, model, yearOfRelease, countryOfProduction, color, speedMax);
        this.spec = spec;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        if (spec != null) {
            this.spec = spec;
        } else {
            this.spec = "не указано назначения";
        }
    }

    @Override
    protected void refill(Boolean gasoline, Boolean diesel, Boolean electro) {
        if (gasoline || diesel) {
            statusRefill = "заправлен";
        } else {
            statusRefill = "не заправлен";
        }
    }

    @Override
    public String toString() {
        return "Bus{}" + super.toString() + spec + statusRefill;
    }
}

