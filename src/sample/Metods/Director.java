package sample.Metods;

public class Director {
    public Constructor construct(Builder builder) {
        builder.buildRring();
        builder.buildRing();
        builder.buildFCircl();
        builder.buildRect();
        builder.buildText();
        builder.buildLin();
        builder.buildArrow();
        return builder.getCon();
    }

}