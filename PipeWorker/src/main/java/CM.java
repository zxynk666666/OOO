public class CM extends Length {

    public CM(int i) {
        super(i);
    }

    @Override
    public MM toMM(){
        return new MM(this.i *10);
    }
}
