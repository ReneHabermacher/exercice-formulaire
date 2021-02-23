package View;

import Controller.ControllerFormulaire;
import Model.LocationManager;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ViewHandler extends Application {
    private ViewFormulaire vueFormulaire;
    private ViewListes vueListes;

    private ControllerFormulaire controllerFormulaire;

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        vueFormulaire = new ViewFormulaire(root, this);
        vueListes = new ViewListes(root, this, LocationManager.getListeVoiture());

        afficherFormulaire();

        primaryStage.setWidth(600);
        primaryStage.setHeight(610);
        primaryStage.setX(500);
        primaryStage.setY(500);

        primaryStage.setTitle("Formulaire location");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setFullScreen(false);
        primaryStage.show();
    }

    public void afficherFormulaire() {
        vueFormulaire.setVueCompleteFormulaire();
    }

    public void afficherListes() {
        vueListes.setVueCompleteListes();
    }

}
