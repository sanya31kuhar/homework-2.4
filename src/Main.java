import Animals.*;
import Transports.Bus;
import Transports.Car;
import Transports.Train;

public class Main {

    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015,
                "Россия", "Желтый", 120, 1.7f);
        System.out.println(lada.toString());

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020,
                "Германия", "Черный", 160, 3.0f);
        System.out.println(audi.toString());

        Car bmw = new Car("BMW", "Z8", 2021,
                "Германия", "Черный", 180, 3.0f);
        System.out.println(bmw.toString());

        Car kia = new Car("Kia", "Sportage 4 поколение", 2016,
                "Южная Корея", "Красный", 140, 2.4f);
        System.out.println(kia.toString());

        Car hyundai = new Car("Hyundai", "Avante", 2016,
                "Южная Корея", "Оранжевый", 170, 1.6f);
        System.out.println(hyundai.toString());

        Train train = new Train(" Ласточка", " B-901", 2011, " Россия",
                301, 3500, 0, "Белорусский вокзал",
                " Минск-Пассажирский", 11, "цвет не указан");

        Train train1 = new Train(" Ленинград", " D-125", 2019, " Россия",
                270, 1700, 0, "Ленинградский вокзал",
                " Ленинград-Пассажирский", 8, "цвет не указан");
        System.out.println(train.toString());
        System.out.println(train1.toString());

        Bus bus = new Bus("IKARUS", "417", 2015, "Венгрия", "Оранжевый", 80f, "diesel");
        Bus bus1 = new Bus("VOLVO", "7900", 2020, " Швеция", "Белый", 100f, "gasoline");
        Bus bus2 = new Bus("IVECO", "Urbanway 10 ", 2021, "Италия", "Синий", 120f, "diesel");
        System.out.println(bus.toString());
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());

        Herbivores gazelle = new Herbivores();
        System.out.println(gazelle.toString());

        Herbivores giraffe = new Herbivores();
        System.out.println(giraffe.toString());

        Herbivores horse = new Herbivores();
        System.out.println(horse.toString());

        Predators hyena = new Predators();
        System.out.println(hyena.toString());

        Predators tiger = new Predators();
        System.out.println(tiger.toString());

        Predators bear = new Predators();
        System.out.println(bear.toString());

        Amphibians frog = new Amphibians();
        System.out.println(frog.toString());

        Amphibians alreadyFreshwater = new Amphibians();
        System.out.println(alreadyFreshwater.toString());

        Flightless peacock = new Flightless();
        System.out.println(peacock.toString());

        Flightless penguin = new Flightless();
        System.out.println(penguin.toString());

        Flightless dodoBird = new Flightless();
        System.out.println(dodoBird.toString());

        Flying gull = new Flying();
        System.out.println(gull.toString());

        Flying albatross = new Flying();
        System.out.println(albatross.toString());

        Flying falcon = new Flying();
        System.out.println(falcon.toString());

        System.out.println(gazelle.equals(giraffe));
    }
}
