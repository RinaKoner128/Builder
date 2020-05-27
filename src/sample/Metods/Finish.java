package sample.Metods;

public class Finish implements Builder {
    private Ffin ffin;

    public Finish() {
        ffin = new Ffin();
    }

    @Override
    public void buildRring() {
        Rring r = new Rring();
        ffin.setRring(r);
    }

    @Override
    public void buildRing() {
        Ring r = new Ring();
        ffin.setRing(r);
    }

    @Override
    public void buildFCircl() {
        FCircl c = new FCircl();
        ffin.setFCircl(c);
    }

    @Override
    public void buildLin() {

    }

    @Override
    public void buildArrow() {

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