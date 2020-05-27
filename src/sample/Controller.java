package sample;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import sample.Metods.*;

public class Controller {
    public Pane pane;
    Director direct = new Director();

    public void ClFin(ActionEvent actionEvent) {
        pane.getChildren().clear();
        Ffin ffin = new Ffin();
        ffin = direct.construct(new Finish());
        pane.getChildren().add(ffin);// добавление к панели pane
    }

    public void ClSt(ActionEvent actionEvent) {
        pane.getChildren().clear();
        Sstate sstate = new Sstate();
        sstate = direct.Sconstruct(new State());
        pane.getChildren().add(sstate);// добавление к панели pane
    }

    public void ClTr(ActionEvent actionEvent) {
        pane.getChildren().clear();
        Ttrl ttrl = new Ttrl();
        ttrl = direct.Tconstruct(new Transition());
        pane.getChildren().add(ttrl);// добавление к панели pane
    }

    public void Clean(ActionEvent actionEvent) {
        pane.getChildren().clear();
    }
}
