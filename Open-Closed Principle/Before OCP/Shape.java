import java.util.Scanner;

public class Shape {
    public String shape;
    public double area ;

    public Shape(String shape) {
        this.shape = shape;
    }
    Scanner s = new Scanner(System.in);
    public Double calacarea(){
        if (shape=="circle"){
            System.out.println("enter the radius");
            int r =s.nextByte();
            area=3.14 * r *r ;
        }
        else if (shape=="rectangle") {
            System.out.println("enter the lenth ");
            int l = s.nextByte();
            System.out.println("enter the width ");
            int w = s.nextByte();
            area = l *w ;

        }
        return area ;
    }
}
