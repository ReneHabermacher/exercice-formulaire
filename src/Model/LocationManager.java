package Model;

import View.ViewFormulaire;

import java.util.ArrayList;

public class LocationManager {

    //Attribut

    private static ArrayList<Voiture> listeVoiture;
    private static ArrayList<Moto> listeMoto;
    private ArrayList<Client> listeClient;

    //Contructeur

    public LocationManager() {

        Voiture voitureUn = new Voiture("Clio", "Renault", 547.7, false, 4, false);
        Voiture voitureDeux = new Voiture("Captur", "Renault", 841.2, false, 3, true);
        Voiture voitureTrois = new Voiture("Talisman", "Renault", 210, false, 2, false);
        Voiture voitureQuatre = new Voiture("2008", "Peugeot", 1001.6, false, 4, false);
        Voiture voitureCinq = new Voiture("Rifter", "Peugeot", 921.7, false, 3, true);
        Voiture voitureSix = new Voiture("308", "Peugeot", 852, false, 2, false);

        Moto motoUn = new Moto("Softail Breakout", "Harley-Davidson", 456.3, false, false);
        Moto motoDeux = new Moto("Road King", "Harley-Davidson", 1456.6, false, false);
        Moto motoTrois = new Moto("Freewheeler", "Harley-Davidson", 274, false, true);
        Moto motoQuatre = new Moto("Aerox", "Yamaha", 891.6, false, false);
        Moto motoCinq = new Moto("Niken", "Yamaha", 477.7, false, false);
        Moto motoSix = new Moto("Royal Star", "Yamaha", 99.1, false, true);

        listeVoiture = new ArrayList<Voiture>();
        listeVoiture.add(voitureUn);
        listeVoiture.add(voitureDeux);
        listeVoiture.add(voitureTrois);
        listeVoiture.add(voitureQuatre);
        listeVoiture.add(voitureCinq);
        listeVoiture.add(voitureSix);

        listeMoto = new ArrayList<Moto>();
        listeMoto.add(motoUn);
        listeMoto.add(motoDeux);
        listeMoto.add(motoTrois);
        listeMoto.add(motoQuatre);
        listeMoto.add(motoCinq);
        listeMoto.add(motoSix);

        listeClient = new ArrayList<Client>();
       // listeClient.add(Client.setNom(String ViewFormulaire.getChampNom()), Client.setPrenom(String ViewFormulaire.getChampPrenom()), Client.setAge(String ViewFormulaire.getChampAge()), Client.setVoitureLouee(), Client.setMotoLouee());
    }

    //Méthode
    public void creerClient(String nom, String prenom, int age, String vLouee, String mLouee) {
        Voiture voitureObj = null;
        Moto motoObjt = null;

    }

    //Getter et Setter

    public static ArrayList<Voiture> getListeVoiture() {
        return listeVoiture;
    }

    public void setListeVoiture(ArrayList<Voiture> listeVoiture) {
        LocationManager.listeVoiture = listeVoiture;
    }

    public static ArrayList<Moto> getListeMoto() {
        return listeMoto;
    }

    public void setListeMoto(ArrayList<Moto> listeMoto) {
        LocationManager.listeMoto = listeMoto;
    }

    public ArrayList<Client> getListeClient() {
        return listeClient;
    }

    public void setListeClient(ArrayList<Client> listeClient) {
        this.listeClient = listeClient;
    }
}
