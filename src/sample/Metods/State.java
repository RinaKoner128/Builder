package sample.Metods;

public class State implements Builder {
    private Ffin ffin;

    public State() {
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

    }

    @Override
    public void buildArrow() {

    }

    @Override
    public void buildRect() {
        Rect rect = new Rect();
        ffin.setRect(rect);
    }

    @Override
    public void buildText() {
        Texts t = new Texts();
        ffin.setTexts(t);
    }

    @Override
    public Ffin getFin() {
        return  ffin;
    }

}
