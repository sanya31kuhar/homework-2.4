package Animals;

public class Flying extends Birds {
    private String typeOfMovement;

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement == null || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "typeOfMovement";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    void fly() {
        System.out.println("летать");
    }

    @Override
    public String toString() {
        return "Flying{" + "typeOfMovement='" + typeOfMovement + '\'' + "} " + super.toString();
    }
}
