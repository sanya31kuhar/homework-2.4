package Animals;

public class Flightless extends Birds {
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

    void walk() {
        System.out.println("гулять");
    }

    @Override
    public String toString() {
        return "Flightless{" + "typeOfMovement='" + typeOfMovement + '\'' + "} " + super.toString();
    }
}

