package Animals;

public class Herbivores extends Mammals {
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

    void graze() {
        System.out.println("пастись");
    }

    @Override
    public String toString() {
        return "Herbivores{" + "typeOfFood='" + typeOfFood + '\'' + "} " + super.toString();
    }
}
