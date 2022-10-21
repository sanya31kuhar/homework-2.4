package Transports;

public class Train extends Transport {
    float tripPrice;
    int travelTime;
    String departureStationName;
    String endingStation;
    int numberOfWagons;
    private String statusRefill;

    public Train(String brand, String model, int yearOfRelease, String countryOfProduction, float speedMax,
                 float tripPrice, int travelTime, String departureStationName, String endingStation,
                 int numberOfWagons, String color) {
        super(brand, model, yearOfRelease, countryOfProduction, color, speedMax);
        this.tripPrice = tripPrice;
        this.travelTime = travelTime;
        this.departureStationName = departureStationName;
        this.endingStation = endingStation;
        this.numberOfWagons = numberOfWagons;
    }

    public float getTripPrice() {
        return tripPrice;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public String getStatusRefill() {
        return statusRefill;
    }

    @Override
    protected void refill(Boolean gasoline, Boolean diesel, Boolean electro) {
        if (diesel) {
            statusRefill = "заправлен";
        } else {
            statusRefill = "не заправлен";
        }
    }

    @Override
    public String toString() {
        return " " + "Поезд-" + getBrand() + getModel() + ", " + getYearOfRelease() + "-года выпуска" + ", " +
                "произведен в" + getCountryOfProduction() + ", скорость движения - " + getSpeedMax() + " км/ч ," +
                " отходит от - " + getDepartureStationName() + " и следует до станции " + getEndingStation() + "." +
                " Цена поездки-" + getTripPrice() + " рублей" + ", в поезде " + getNumberOfWagons() + " вагонов." +
                getStatusRefill();
    }
}


