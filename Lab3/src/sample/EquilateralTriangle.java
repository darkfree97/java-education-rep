package sample;

/**
 * Created by Darkfree on 27.09.2016.
 */
public class EquilateralTriangle extends Triangle implements Figure {
    public EquilateralTriangle(int a) {
        super(a, a, a);
    }
    public double square(){
        double res = Math.pow(a,2)*Math.sqrt(3)/4;
        return res;
    }
    public double perimeter(){
        return a*3;
    }
    public double height(){
        double A = a.doubleValue();
        return Math.sqrt((Math.pow(A,2)-Math.pow((A/2),2)));
    }
    public double median(){
        return height();
    }
    public double bisector(){
        return height();
    }
}
