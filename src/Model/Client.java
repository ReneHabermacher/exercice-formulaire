package Model;

public class Client {
    //Attribut
    private String nom;
    private String prenom;
    private int age;
    private Voiture voitureLouee;
    private Moto motoLouee;

    //Constructeur

    public Client(String nom, String prenom, int age, Voiture voitureLouee, Moto motoLouee) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.voitureLouee = voitureLouee;
        this.motoLouee = motoLouee;
    }

    //Getter et Setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Voiture getVoitureLouee() {
        return voitureLouee;
    }

    public void setVoitureLouee(Voiture voitureLouee) {
        this.voitureLouee = voitureLouee;
    }

    public Moto getMotoLouee() {
        return motoLouee;
    }

    public void setMotoLouee(Moto motoLouee) {
        this.motoLouee = motoLouee;
    }
}
