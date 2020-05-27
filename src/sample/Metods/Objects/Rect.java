package sample.Metods.Objects;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Rect extends Rectangle {
    public Rect(double w, double h, Paint fill) {
        super(w, h, fill);
    }

    public Rect() {
        super(120, 70, Color.AQUA);
    }
}
