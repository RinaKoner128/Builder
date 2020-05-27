package sample.Metods;

import javafx.scene.Group;

public class Ffin extends Group {
    public Ffin() {
    }

    public void setRring(Rring m) {
        getChildren().add(m);
    }

    public void setRing(Ring m) {
        getChildren().add(m);
    }

    public void setFCircl(FCircl m) {
        getChildren().add(m);
    }

    public void setLin(Lin m) {
        getChildren().add(m);
    }

    public void setArrow(Arrow m) {
        getChildren().add(m);
    }

    public void setRect(Rect m) {
        getChildren().add(m);
    }

    public void setTexts(Texts m) {
        getChildren().add(m);
    }

    public String toString() {
        return new String("Финиш");
    }
}