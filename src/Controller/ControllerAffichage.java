package Controller;

import Model.LocationManager;
import View.ViewHandler;
import View.ViewListes;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class ControllerAffichage implements EventHandler<MouseEvent> {

    private ViewListes viewListes;
    private ViewHandler launcher;
    private LocationManager locationManager;


    public ControllerAffichage(ViewListes viewListes, ViewHandler launcher) {
        this.viewListes = viewListes;
        this.launcher = launcher;

    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(viewListes.getRetour())) {
            //le comportement après avoir clic sur retour
            launcher.afficherFormulaire();
        }

    }
}
