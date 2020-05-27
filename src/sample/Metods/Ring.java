package sample.Metods;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Ring extends Circle {
    public Ring( double x, double y,double radius, Paint fill) {

        super( x,y, radius, fill);
    }

    public Ring() {
        super(40,50,15, Color.WHITE);
    }
}