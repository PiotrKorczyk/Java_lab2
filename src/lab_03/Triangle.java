package lab_03;

import java.util.Arrays;

public class Triangle implements Comparable<Triangle> {

    private Point A;
    private Point B;
    private Point C;
    private static int counter = 0;

    public Triangle(Point _p1, Point _p2, Point _p3) {
        setA(_p1);
        setB(_p2);
        setC(_p3);
        counter++;
    }

    public Triangle(double _p1x, double _p1y, double _p2x, double _p2y, double _p3x, double _p3y) {
        A = new Point(_p1x, _p1y);
        B = new Point(_p2x, _p2y);
        C = new Point(_p3x, _p3y);
        counter++;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
    }

    public double calculateCircuit() {
        double _circuit = Point.calculateDistance(A, B) + Point.calculateDistance(B, C) + Point.calculateDistance(C, A);
        return _circuit;
    }

    public double calculateArea() {
        double _p = calculateCircuit() / 2;
        double _AB = Point.calculateDistance(A, B);
        double _BC = Point.calculateDistance(B, C);
        double _CA = Point.calculateDistance(C, A);
        double _s = Math.sqrt(_p * (_p - _AB) * (_p - _BC) * (_p - _CA));
        
        return _p;

    }

    public double calculateHeightAB() {
        return (2 * calculateArea()) / Point.calculateDistance(A, B);
    }

    public double calculateHeightBC() {
        return (2 * calculateArea()) / Point.calculateDistance(B, C);
    }

    public double calculateHeightCA() {
        return (2 * calculateArea()) / Point.calculateDistance(C, A);
    }

    public static void addToTab(Triangle _t, Triangle [] tTab) {
        if (tTab.length >= counter) {
            tTab[counter - 1] = _t;
        } else {
            System.out.println("Brak miejsca w tablicy!!!");
        }
    }
    
    public static void printTab(Triangle []tTab){
        for(int i =0;i <counter;i++){
            System.out.println(tTab[i]);
        }
    }
    public static void sortTab(Triangle []t){
        Arrays.sort(t);
    }
    
    public static Triangle[] createTab(int n){
            return new Triangle[n];
    }
    
//    
//    public static boolean tryCreateTriangle(Point _p1, Point _p2, Point _p3) {
//        return !(Point.calculateDistance(_p1, _p2) > (Point.calculateDistance(_p2, _p3) + Point.calculateDistance(_p3, _p1))
//                || Point.calculateDistance(_p2, _p3) > (Point.calculateDistance(_p3, _p1) + Point.calculateDistance(_p1, _p2))
//                || Point.calculateDistance(_p3, _p1) > (Point.calculateDistance(_p1, _p3) + Point.calculateDistance(_p2, _p3)));
    //}

    @Override
    public String toString() {
        return "Triangle{" + "A=" + A + ", B=" + B + ", C=" + C + '}';
    }

    @Override
    public int compareTo(Triangle _t) {
        if (this.calculateArea() < _t.calculateArea()) {
            return -1;
        } else if (this.calculateArea() > _t.calculateArea()) {
            return 1;
        } else {
            return 0;
        }
    }

}
