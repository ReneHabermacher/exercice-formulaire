package Model;

public class Vehicule {

    //Attribut
    protected String modele;
    protected String marque;
    protected double km;
    protected boolean estLouee;

    //Constructeur

    public Vehicule(String modele, String marque, double km, boolean estLouee) {
        this.modele = modele;
        this.marque = marque;
        this.km = km;
        this.estLouee = estLouee;
    }

    //Getter et Setter

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public boolean isEstLouee() {
        return estLouee;
    }

    public void setEstLouee(boolean estLouee) {
        this.estLouee = estLouee;
    }
}
