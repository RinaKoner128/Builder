package sample.Metods;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class FCircl extends Circle {
    public FCircl(double x, double y,double radius, Paint fill) {

        super(x,y,radius, fill);
    }
    public FCircl() {
        super(40,50,10, Color.BLACK);
    }
}
