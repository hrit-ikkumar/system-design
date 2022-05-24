package liskov_substitution.before;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public int getS() {
        return super.getH();
    }

    public void setS(int s) {
        super.setH(s);
        super.setW(s);
    }

    @Override
    public int computeArea() {
        return super.getH()*super.getW();
    }

    @Override
    public void setH(int h) {
        super.setH(h);
        super.setW(h);
    }

    @Override
    public void setW(int w) {
        super.setW(w);
        super.setH(w);
    }
}
