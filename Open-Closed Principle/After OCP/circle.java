public class circle implements  shape {
    public Double r ;

    public circle(Double r) {
        this.r = r;
    }

    @Override
    public double calcarea() {
        return r*r*3.14 ;


    }
}
