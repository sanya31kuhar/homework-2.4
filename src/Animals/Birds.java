package Animals;

public class Birds extends Animal {
    private String livingEnvironment;

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

    @Override
    void eat() {
        System.out.println("кушает");
    }

    @Override
    void go() {
        System.out.println("идет");
    }

    void hunt() {
        System.out.println("охотиться");
    }

    @Override
    public String toString() {
        return "Birds{" + "livingEnvironment='" + livingEnvironment + '\'' + "} " + super.toString();
    }
}
