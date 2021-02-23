package Model;

public class Voiture extends Vehicule {

    //Attribut

    private int nbPlaces;
    private boolean barresDeToit;

    //Constructeur

    public Voiture(String modele, String marque, double km, boolean estLouee, int nbPlaces, boolean barresDeToit) {
        super(modele, marque, km, estLouee);
        this.nbPlaces = nbPlaces;
        this.barresDeToit = barresDeToit;
    }

    //Methode

    @Override
    public String toString() {
        return "Voiture : " +
                "modele : " + modele + '\n' +
                "marque : " + marque + '\n' +
                "km : " + km + '\n' +
                "estLouee : " + estLouee +'\n' +
                "nbPlaces : " + nbPlaces +'\n' +
                "barresDeToit :" + barresDeToit + '\n';
    }


    //Getter et Setter

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public boolean isBarresDeToit() {
        return barresDeToit;
    }

    public void setBarresDeToit(boolean barresDeToit) {
        this.barresDeToit = barresDeToit;
    }
}
