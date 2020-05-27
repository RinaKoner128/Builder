package sample.Metods;

public class Transition implements Builder {
    private Ffin ffin;
    public Transition() {
        ffin = new Ffin();
    }

    @Override
    public void buildRring() {

    }

    @Override
    public void buildRing() {

    }

    @Override
    public void buildFCircl() {

    }

    @Override
    public void buildLin() {
        Lin lin = new Lin();
        ffin.setLin(lin);
    }

    @Override
    public void buildArrow() {
        Arrow arrow = new Arrow();
        ffin.setArrow(arrow);
    }

    @Override
    public void buildRect() {

    }

    @Override
    public void buildText() {

    }

    @Override
    public Ffin getFin() {
        return ffin;
    }

}
