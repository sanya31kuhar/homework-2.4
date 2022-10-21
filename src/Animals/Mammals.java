package Animals;

public class Mammals extends Animal {
    private String livingEnvironment;
    private float movementSpeed;

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "не указана среда";
        }
    }

    public void setMovementSpeed(float movementSpeed) {
        if (movementSpeed <= 0) {
            movementSpeed = -1;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }

    @Override
    void eat() {
        System.out.println("кушает");
    }

    @Override
    void go() {
        System.out.println("идет");
    }

    void walk() {
        System.out.println("гулять");
    }

    @Override
    public String toString() {
        return "Mammals{" + "livingEnvironment='" + livingEnvironment + "movementSpeed" + movementSpeed +
                '\'' + "} " + super.toString();
    }
}




