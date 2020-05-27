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

    public String toString() {
        return new String("Финиш");
    }
}