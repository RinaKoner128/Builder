package sample.Metods;

public class Transition implements Builder {
    private Ttrl ttrl;

    public Transition() {
        ttrl = new Ttrl();
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
        ttrl.setLin(lin);
    }

    @Override
    public void buildArrow() {
        Arrow arrow = new Arrow();
        ttrl.setArrow(arrow);
    }

    @Override
    public void buildRect() {

    }

    @Override
    public void buildText() {

    }

    @Override
    public Ffin getFin() {
        return null;
    }

    @Override
    public Ttrl getTtrl() {
        return ttrl;
    }

    @Override
    public Sstate getSstate() {
        return null;
    }
}
