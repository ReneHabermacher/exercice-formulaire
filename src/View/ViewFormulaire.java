package View;

import Controller.ControllerFormulaire;
import Model.LocationManager;
import Tools.Path;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Screen;

public class ViewFormulaire {
    //Attributs
    private Group root;
    private LocationManager locationManager;

    // todo Etape 1) on va créer ici les attributs que l'on va afficher dans le menu
    private Button afficher, valider;
    private Label nom, prenom, age, voituresDispo, motosDispo;
    private ImageView imgBg;
    private TextField champNom, champPrenom, champAge;
    private ComboBox<String> listeVoituresDispo, listeMotosDispo;


    // tous les controllers seront ici

    private ControllerFormulaire controllerFormulaire;

    // tous les models partiront d'ici
    //private Menu menu;


    //Constructeurs
    public ViewFormulaire(Group root, ViewHandler launcher) {

        this.root = root;
        this.locationManager = new LocationManager();
        this.controllerFormulaire = new ControllerFormulaire(this, launcher);

        // todo Etape 2) on va initialiser les éléments à afficher dans le menu.
        // todo il est possible de le faire dans des méthodes pour plus de lisibilité

        affichageNom();
        affichageChampNom();
        affichagePrenom();
        affichageChampPrenom();
        affichageAge();
        affichageChampAge();
        affichageVoituresDispo();
        initListeVoiture();
        affichageMotosDispo();
        initListeMoto();
        initboutonValider();
        initboutonAfficher();


    }

    /**
     * Mise en place de l'image de fond en fonction de la taille de l'écran de l'utilisateur
     */

    private void affichageNom() {

        nom = new Label("Nom :");
        nom.setTranslateX((int) 50);
        nom.setTranslateY((int) 50);
        nom.setStyle("-fx-background-color: none; " +
                "-fx-text-fill: black;");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), (int) 30);
        nom.setFont(policeTitre);
    }

    private void affichageChampNom() {

        champNom = new TextField();
        champNom.setTranslateX((int) 270);
        champNom.setTranslateY((int) 60);

    }

    private void affichagePrenom() {

        prenom = new Label("Prénom :");
        prenom.setTranslateX((int) 50);
        prenom.setTranslateY((int) 100);
        prenom.setStyle("-fx-background-color: none; " +
                "-fx-text-fill: black;");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), (int) 30);
        prenom.setFont(policeTitre);
    }

    private void affichageChampPrenom() {
        champPrenom = new TextField();
        champPrenom.setTranslateX((int) 270);
        champPrenom.setTranslateY((int) 110);
    }

    private void affichageAge() {
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        age = new Label("Age :");
        age.setTranslateX((int) 50);
        age.setTranslateY((int) 150);
        age.setStyle("-fx-background-color: none; " +
                "-fx-text-fill: black;");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), (int) 30);
        age.setFont(policeTitre);
    }

    private void affichageChampAge() {
        champAge = new TextField();
        champAge.setTranslateX((int) 270);
        champAge.setTranslateY((int) 160);
    }

    private void affichageVoituresDispo() {
        voituresDispo = new Label("Voitures dispo :");
        voituresDispo.setTranslateX((int) 50);
        voituresDispo.setTranslateY((int) 200);
        voituresDispo.setStyle("-fx-background-color: none; " +
                "-fx-text-fill: black;");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), (int) 30);
        voituresDispo.setFont(policeTitre);
    }

    public void initListeVoiture() {
        listeVoituresDispo = new ComboBox<>();
        listeVoituresDispo.getItems().add(LocationManager.getListeVoiture().get(0).getModele());
        listeVoituresDispo.getItems().add(LocationManager.getListeVoiture().get(1).getModele());
        listeVoituresDispo.getItems().add(LocationManager.getListeVoiture().get(2).getModele());
        listeVoituresDispo.getItems().add(LocationManager.getListeVoiture().get(3).getModele());
        listeVoituresDispo.getItems().add(LocationManager.getListeVoiture().get(4).getModele());
        listeVoituresDispo.getItems().add(LocationManager.getListeVoiture().get(5).getModele());

        listeVoituresDispo.setTranslateX((int) 270);
        listeVoituresDispo.setTranslateY((int) 210);
    }

    private void affichageMotosDispo() {
        motosDispo = new Label("Motos dispo :");
        motosDispo.setTranslateX((int) 50);
        motosDispo.setTranslateY((int) 250);
        motosDispo.setStyle("-fx-background-color: none; " +
                "-fx-text-fill: black;");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), (int) 30);
        motosDispo.setFont(policeTitre);
    }

    private void initListeMoto() {
        listeMotosDispo = new ComboBox<>();
        listeMotosDispo.getItems().add(LocationManager.getListeMoto().get(0).getModele());
        listeMotosDispo.getItems().add(LocationManager.getListeMoto().get(1).getModele());
        listeMotosDispo.getItems().add(LocationManager.getListeMoto().get(2).getModele());
        listeMotosDispo.getItems().add(LocationManager.getListeMoto().get(3).getModele());
        listeMotosDispo.getItems().add(LocationManager.getListeMoto().get(4).getModele());
        listeMotosDispo.getItems().add(LocationManager.getListeMoto().get(5).getModele());

        listeMotosDispo.setTranslateX((int) 270);
        listeMotosDispo.setTranslateY((int) 260);
    }

    private void initboutonValider() {
        valider = new Button("Valider");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        valider.setTranslateX((int) 50);
        valider.setTranslateY((int) 350);
        valider.setStyle("-fx-background-color: lightgrey;" +
                "-fx-text-fill: black;");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), (int) 30);
        valider.setFont(policeTitre);
        valider.setOnMouseClicked(controllerFormulaire);

        valider.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                valider.setStyle("-fx-background-color: none; " +
                        "-fx-effect : dropshadow(two-pass-box, white, 6, 2, 2, 2);" +
                        "-fx-text-fill: blue;");
            }
        });

        valider.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                valider.setStyle("-fx-background-color: lightgrey; " +
                        "-fx-text-fill: black;");
            }
        });
    }

    private void initboutonAfficher() {
        afficher = new Button("Afficher");
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getBounds();
        afficher.setTranslateX((int) 270);
        afficher.setTranslateY((int) 350);
        afficher.setStyle("-fx-background-color: lightgrey; " +
                "-fx-text-fill: black;");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), (int) 30);
        afficher.setFont(policeTitre);
        afficher.setOnMouseClicked(controllerFormulaire);

        afficher.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                afficher.setStyle("-fx-background-color: none; " +
                        "-fx-effect : dropshadow(two-pass-box, white, 6, 2, 2, 2);" +
                        "-fx-text-fill: blue;");
            }
        });

        afficher.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                afficher.setStyle("-fx-background-color: lightgrey; " +
                        "-fx-text-fill: black;");
            }
        });
    }

    /**
     * Ajoute a la vue tous les éléments composant le menu
     */
    public void setVueCompleteFormulaire() {
        root.getChildren().clear();
        // todo Etape 3) on met ici les éléments du formulaire à afficher.
        //    root.getChildren().add(imgBg);
        root.getChildren().add(afficher);
        root.getChildren().add(valider);
        root.getChildren().add(champNom);
        root.getChildren().add(champPrenom);
        root.getChildren().add(champAge);
        root.getChildren().add(nom);
        root.getChildren().add(prenom);
        root.getChildren().add(age);
        root.getChildren().add(voituresDispo);
        root.getChildren().add(listeVoituresDispo);
        root.getChildren().add(motosDispo);
        root.getChildren().add(listeMotosDispo);
    }

    //Getter et Setter


    public ComboBox<String> getListeVoituresDispo() {
        return listeVoituresDispo;
    }

    public void setListeVoituresDispo(ComboBox<String> listeVoituresDispo) {
        this.listeVoituresDispo = listeVoituresDispo;
    }

    public ComboBox<String> getListeMotosDispo() {
        return listeMotosDispo;
    }

    public void setListeMotosDispo(ComboBox<String> listeMotosDispo) {
        this.listeMotosDispo = listeMotosDispo;
    }

    public Group getRoot() {
        return root;
    }

    public void setRoot(Group root) {
        this.root = root;
    }

    public Button getAfficher() {
        return afficher;
    }

    public void setAfficher(Button afficher) {
        this.afficher = afficher;
    }

    public Button getValider() {
        return valider;
    }

    public void setValider(Button valider) {
        this.valider = valider;
    }

    public Label getNom() {
        return nom;
    }

    public void setNom(Label nom) {
        this.nom = nom;
    }

    public Label getPrenom() {
        return prenom;
    }

    public void setPrenom(Label prenom) {
        this.prenom = prenom;
    }

    public Label getAge() {
        return age;
    }

    public void setAge(Label age) {
        this.age = age;
    }

    public Label getVoituresDispo() {
        return voituresDispo;
    }

    public void setVoituresDispo(Label voituresDispo) {
        this.voituresDispo = voituresDispo;
    }

    public Label getMotosDispo() {
        return motosDispo;
    }

    public void setMotosDispo(Label motosDispo) {
        this.motosDispo = motosDispo;
    }

    public ImageView getImgBg() {
        return imgBg;
    }

    public void setImgBg(ImageView imgBg) {
        this.imgBg = imgBg;
    }

    public  TextField getChampNom() {
        return champNom;
    }

    public void setChampNom(TextField champNom) {
        this.champNom = champNom;
    }

    public  TextField getChampPrenom() {
        return champPrenom;
    }

    public void setChampPrenom(TextField champPrenom) {
        this.champPrenom = champPrenom;
    }

    public  TextField getChampAge() {
        return champAge;
    }

    public void setChampAge(TextField champAge) {
        this.champAge = champAge;
    }

    public ControllerFormulaire getControllerFormulaire() {
        return controllerFormulaire;
    }

    public void setControllerFormulaire(ControllerFormulaire controllerFormulaire) {
        this.controllerFormulaire = controllerFormulaire;
    }
}
