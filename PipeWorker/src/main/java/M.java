public class M extends Length{

    public M(int i) {
        super(i);
    }

    @Override
    public MM toMM() {
        return new MM(this.i * 1000);
    }


}
