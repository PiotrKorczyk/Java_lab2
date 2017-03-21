package lab_03;

public class Point {

    private double x;
    private double y;

    public Point(double _x, double _y) {
        this.x = _x;
        this.y = _y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    public void changePoint(double _x, double _y) {
        setX(_x);
        setY(_y);
    }

    public static double calculateDistance(Point _p1, Point _p2) {
        double distance  = Math.sqrt( Math.pow((_p2.getX() - _p1.getX()),2 )+ Math.pow((_p2.getY() - _p1.getY()),2 ) );
        return distance;
    }

}
