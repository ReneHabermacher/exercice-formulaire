package Controller;


import View.ViewFormulaire;
import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

import java.awt.event.MouseListener;

public class ControllerFormulaire implements EventHandler<MouseEvent> {

    private ViewFormulaire viewFormulaire;
    private ViewHandler launcher;



    public ControllerFormulaire(ViewFormulaire viewFormulaire, ViewHandler launcher) {
        this.viewFormulaire = viewFormulaire;
        this.launcher = launcher;

    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().equals(viewFormulaire.getValider())) {
            //le comportement après avoir clic sur valider

        } else if (event.getSource().equals(viewFormulaire.getAfficher())) {
            //le comportement après avoir clic sur afficher
            launcher.afficherListes();
        }
    }
}
