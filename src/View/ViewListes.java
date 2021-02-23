package View;

import Controller.ControllerAffichage;
import Model.Client;
import Model.LocationManager;
import Model.Moto;
import Model.Voiture;
import Tools.Path;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;

import java.util.ArrayList;

public class ViewListes {

    private Group root;
    private ControllerAffichage controllerAffichage;
    private Button retour;
    private ArrayList<Text> listeVoitures;
    private ArrayList<Moto> listeMotos;
    private ArrayList<Client> listeClients;

    public ViewListes(Group root, ViewHandler launcher, ArrayList<Voiture> listeVoitures) {
        this.root = root;
        this.controllerAffichage = new ControllerAffichage(this, launcher);
        this.listeVoitures = listeVoitures;

        affichageListes();
        initboutonRetour();

    }

    private void affichageListes() {
        listeVoitures = new ArrayList<>(LocationManager.getListeVoiture());
        for (int i = 0; i < LocationManager.getListeVoiture().size(); i++) {
            listeVoitures.add(new Text(LocationManager.getListeVoiture().get(i).toString();
            listeVoitures.get(i).setTranslateX((int) 10);
            listeVoitures.get(i).setTranslateY((int) 10 * i);
        }
    }

    private void initboutonRetour() {
        retour = new Button("Retour");

        retour.setTranslateX((int) 270);
        retour.setTranslateY((int) 350);
        retour.setStyle("-fx-background-color: lightgrey; " +
                "-fx-text-fill: black;");
        Font policeTitre = Font.loadFont(getClass().getResourceAsStream(Path.fontHeadCase), (int) 30);
        retour.setFont(policeTitre);
        retour.setOnMouseClicked(controllerAffichage);

        retour.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                retour.setStyle("-fx-background-color: none; " +
                        "-fx-effect : dropshadow(two-pass-box, white, 6, 2, 2, 2);" +
                        "-fx-text-fill: blue;");
            }
        });

        retour.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                retour.setStyle("-fx-background-color: lightgrey; " +
                        "-fx-text-fill: black;");
            }
        });
    }

    /**
     * Ajoute a la vue tous les éléments composant le menu
     */
    public void setVueCompleteListes() {
        root.getChildren().clear();
        // todo Etape 3) on met ici les éléments de la vue des listes à afficher.
        //    root.getChildren().add(imgBg);
        for (int i = 0; i < listeVoitures.size(); i++) {
           root.getChildren().add(listeVoitures.get(i));
        }
        root.getChildren().add(retour);
    }

    //Getter et Setter

    public Group getRoot() {
        return root;
    }

    public void setRoot(Group root) {
        this.root = root;
    }

    public ControllerAffichage getControllerAffichage() {
        return controllerAffichage;
    }

    public void setControllerAffichage(ControllerAffichage controllerAffichage) {
        this.controllerAffichage = controllerAffichage;
    }

    public Button getRetour() {
        return retour;
    }

    public void setRetour(Button retour) {
        this.retour = retour;
    }
}
