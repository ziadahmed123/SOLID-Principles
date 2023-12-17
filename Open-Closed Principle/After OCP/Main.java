public class Main {
    public static void main(String[] args) {
        circle c = new circle(7.0) ;
        rectangle r = new rectangle(5.0,7.0);
        System.out.println("the area for circle :"+c.calcarea());
        System.out.println("the area for rectangle :"+r.calcarea());

    }
}