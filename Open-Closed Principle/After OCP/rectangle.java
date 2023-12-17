public class rectangle implements shape {
    public double l ;
    public double w ;

    public rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double calcarea() {
        return l * w;

    }
}
