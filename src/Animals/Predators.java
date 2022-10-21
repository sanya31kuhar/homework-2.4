package Animals;

public class Predators extends Mammals {
    private String typeOfFood;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "не указана еда";
        }
    }

    void hunt() {
        System.out.println("охотиться");
    }

    @Override
    public String toString() {
        return "Predators{" + "typeOfFood='" + typeOfFood + '\'' + "} " + super.toString();
    }
}
