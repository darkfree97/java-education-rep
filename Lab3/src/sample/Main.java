package sample;

public class Main {
    public static void main(String[] args) {
        Triangle pTgl = new Triangle(50,60,20);
        pTgl.getInfo();
        System.out.println("Perimeter: "+pTgl.perimeter());
        System.out.println("Square: "+pTgl.square());
        System.out.println("Bisector A: "+pTgl.bisector('a'));
        System.out.println("Bisector B: "+pTgl.bisector('b'));
        System.out.println("Bisector C: "+pTgl.bisector('c'));
        System.out.println("Median A: "+pTgl.median('a'));
        System.out.println("Median B: "+pTgl.median('b'));
        System.out.println("Median C: "+pTgl.median('c'));
        System.out.println("Height A: "+pTgl.height('a'));
        System.out.println("Height B: "+pTgl.height('b'));
        System.out.println("Height C: "+pTgl.height('c'));
        System.out.println("///////////////////////////////////////////////////////////////");
        EquilateralTriangle cTgl = new EquilateralTriangle(5);
        cTgl.getInfo();
        System.out.println("Perimeter: "+cTgl.perimeter());
        System.out.println("Square: "+cTgl.square());
        System.out.println("Bisector A,B,C: "+cTgl.bisector());
        System.out.println("Median A,B,C: "+cTgl.median());
        System.out.println("Height A,B,C: "+cTgl.height());
    }
}
