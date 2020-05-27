package sample.Metods;

public class State implements Builder {
    private Sstate sstate;

    public State() {
        sstate = new Sstate();
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
        sstate.setRect(rect);
    }

    @Override
    public void buildText() {
        Texts t = new Texts();
        sstate.setTexts(t);
    }

    @Override
    public Ffin getFin() {
        return null;
    }

    @Override
    public Ttrl getTtrl() {
        return null;
    }

    @Override
    public Sstate getSstate() {
        return sstate;
    }
}
