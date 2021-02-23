package Model;

public class Moto extends Vehicule {

    //Attribut
    private boolean sideCar;

    //Constructeur

    public Moto(String modele, String marque, double km, boolean estLouee, boolean sideCar) {
        super(modele, marque, km, estLouee);
        this.sideCar = sideCar;
    }


    //Getter et Setter

    public boolean isSideCar() {
        return sideCar;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }
}
