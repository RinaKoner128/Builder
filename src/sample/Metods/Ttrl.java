package sample.Metods;

import javafx.scene.Group;

public class Ttrl extends Group {
    public Ttrl() {
    }
    public void setLin(Lin m) {
        getChildren().add(m);
    }

    public void setArrow(Arrow m) {
        getChildren().add(m);
    }

    public String toString() {
        return new String("Стрелка");
    }
}

