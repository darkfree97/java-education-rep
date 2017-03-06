package sample;

/**
 * Created by Darkfree on 27.09.2016.
 */
public class Triangle {
    protected static Integer a;
    protected static Integer b;
    protected static Integer c;
    protected static boolean existence;
    public Triangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
        existence = (((a+b)>c)&&((a+c)>b)&&((b+c)>a))?true:false;
    }
    public void getInfo(){
        System.out.println("Size of the triangle sides:\n\ta: "+this.a+"\n\tb: "+this.b+"\n\tc: "+this.c);
        System.out.println("Is exist: "+(existence?"Yes":"No"));
    }
    public double perimeter(){
        return a+b+c;
    }
    public double square(){
        double p = (a.doubleValue()+b.doubleValue()+c.doubleValue())/2;
        double res = Math.sqrt((p*(p-a.doubleValue())*(p-b.doubleValue())*(p-c.doubleValue())));
        return res;
    }
    public double height(char side_name){
        double _a = a.doubleValue();
        double _b = b.doubleValue();
        double _c = c.doubleValue();
        switch (side_name){
            case 'a':
                return 2*square()/_a;
            case 'b':
                return 2*square()/_b;
            case 'c':
                return 2*square()/_c;
            default:
                return 0;
        }
    }
    public static double median(char side_name){
        double _a = a.doubleValue();
        double _b = b.doubleValue();
        double _c = c.doubleValue();
        switch (side_name){
            case 'a':
                return (1.0/2.0)*(Math.sqrt((2*Math.pow(_b,2))+(2*Math.pow(_c,2))-(Math.pow(_a,2))));
            case 'b':
                return (1.0/2.0)*(Math.sqrt((2*Math.pow(_a,2))+(2*Math.pow(_c,2))-(Math.pow(_b,2))));
            case 'c':
                return (1.0/2.0)*(Math.sqrt((2*Math.pow(_a,2))+(2*Math.pow(_b,2))-(Math.pow(_c,2))));
            default:
                return 0;
        }
    }
    public static double bisector(char side_name){
        double _a = a.doubleValue();
        double _b = b.doubleValue();
        double _c = c.doubleValue();
        switch (side_name){
            case 'a':
                return 1/(_b+_c)*Math.sqrt(_b*_c*(_a+_b+_c)*(_b+_c-_a));
            case 'b':
                return 1/(_a+_c)*Math.sqrt(_a*_c*(_a+_b+_c)*(_b+_c-_a));
            case 'c':
                return 1/(_a+_b)*Math.sqrt(_a*_b*(_a+_b+_c)*(_b+_c-_a));
            default:
                return 0;
        }
    }
}
