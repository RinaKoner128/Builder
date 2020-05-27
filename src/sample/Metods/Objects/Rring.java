package sample.Metods.Objects;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Rring extends Circle {
    public Rring( double x, double y, double radius, Paint fill) {

        super(x,y,radius, fill);
    }

    public Rring() {
        super(40,50,18, Color.BLACK);
    }
}
