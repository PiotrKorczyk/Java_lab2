package lab_03;

import java.util.Arrays;

public class Quadrangle implements Comparable<Quadrangle> {

    static void addToTab(Quadrangle quadrangle, Triangle[] t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Point A;
    private Point B;
    private Point C;
    private Point D;
    private static int counter =0;
    
    public Quadrangle(Point _p1, Point _p2, Point _p3,Point _p4) {
        setA(_p1);
        setB(_p2);
        setC(_p3);
        setD(_p4);
        counter ++;
    }

    public Quadrangle(double _p1x, double _p1y, double _p2x, double _p2y, double _p3x, double _p3y, double _p4x, double _p4y) {
        A = new Point(_p1x, _p1y);
        B = new Point(_p2x, _p2y);
        C = new Point(_p3x, _p3y);
        D = new Point(_p4x, _p4y);
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
    
    
    public Point getD() {
        return D;
    }

    public void setD(Point D) {
        this.D = D;
    }

    public double calculateCircuit() {
        double _circuit = Point.calculateDistance(A, B) + Point.calculateDistance(B, C) + Point.calculateDistance(C, D) +
                Point.calculateDistance(D, A);
        return _circuit;
    }

    public double calculateArea() {
        Triangle t1 = new Triangle(A,B,C);
        Triangle t2 = new Triangle(C,D,A);
        double _area = t1.calculateArea() + t2.calculateArea();
        return _area;

    }

    public double calculateDiagonalAC() {
        return  Point.calculateDistance(A, C);
    }

    public double calculateDiagonalBD() {
        return  Point.calculateDistance(B, D);
    }

    @Override
    public String toString() {
        return "Quadrangle{" + "A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + '}';
    }
    
    
    
    
     public static void addToTab(Quadrangle _t, Quadrangle[] tTab) {
        if (tTab.length >= counter) {
            tTab[counter - 1] = _t;
        } else {
            System.out.println("Brak miejsca w tablicy!!!");
        }
    }
    
    public static void printTab(Quadrangle []tTab){
        for(int i =0;i <counter;i++){
            System.out.println(tTab[i]);
        }
    }
    public static void sortTab(Quadrangle []t){
        Arrays.sort(t);
    }
    
    public static Quadrangle[] createTab(int n){
            return new Quadrangle[n];
    }
    
    @Override
    public int compareTo(Quadrangle _t) {
        if (this.calculateArea() < _t.calculateArea()) {
            return -1;
        } else if (this.calculateArea() > _t.calculateArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    

   
}

