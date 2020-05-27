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
        Ffin ffin = new Ffin();
        ffin= direct.construct(new State());
        pane.getChildren().add(ffin);// добавление к панели pane
    }

    public void ClTr(ActionEvent actionEvent) {
        pane.getChildren().clear();
        Ffin ffin = new Ffin();
        ffin = direct.construct(new Transition());
        pane.getChildren().add(ffin);// добавление к панели pane
    }

    public void Clean(ActionEvent actionEvent) {
        pane.getChildren().clear();
    }
}
