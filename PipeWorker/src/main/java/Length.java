public abstract class Length {

    protected final int i;

    public Length(int i) {
        this.i = i;
    }

    public abstract MM toMM();

    @Override
    public boolean equals(Object o) {

        Length length = (Length) o;

        MM mm = length.toMM();
        MM thisMM = this.toMM();
        if (mm.hashCode() != thisMM.hashCode()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return i;
    }

    public Length add(Length length) {
        return new MM(this.toMM().i + length.toMM().i);
    }

    public Length times(int operand) {
        return new MM(this.toMM().i * operand);
    }

    public Length divideBy(int operand) {
        return new MM(this.toMM().i/operand);
    }

    public Length minus(MM mm) {
        return new MM(this.toMM().i - mm.i);
    }
}
