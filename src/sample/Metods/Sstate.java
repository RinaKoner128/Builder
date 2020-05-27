package sample.Metods;

import javafx.scene.Group;

public class Sstate extends Group {
    public Sstate() {
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


