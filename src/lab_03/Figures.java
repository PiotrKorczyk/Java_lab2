package lab_03;

public class Figures {



    public static void main(String[] args) {
       
  
//        System.out.println(t1);
//        System.out.println("obw: " + t1.calculateCircuit());
//        System.out.println("area: " + t1.calculateArea());
////        System.out.println("height: " + tr1.calculateHeightAB());
//        
//        Quadrangle q1 = new Quadrangle(4,1,4,5,1,5,1,1);
//        
//       
//        System.out.println(q1.calculateCircuit());
//        System.out.println(q1.calculateArea());
//        System.out.println(q1.calculateDiagonalAC());


        Triangle t [] = Triangle.createTab(3);
          Triangle t1 = new Triangle(1,1,4,1,4,5);
        Triangle.addToTab(t1,t);
        Triangle t2 = new Triangle(1,1,4,1,4,4);
        Triangle.addToTab(t2,t);

        Triangle t3 = new Triangle(1,1,4,1,4,3);
        Triangle.addToTab(t3,t);
        Triangle.printTab(t);
        Triangle.sortTab(t);
        Triangle.printTab(t);
        
        Quadrangle q [] = Quadrangle.createTab(3);
        Quadrangle.addToTab(new Quadrangle(10,20,3,4,1,1,1,1), q);
        Quadrangle.addToTab(new Quadrangle(0,0,4,3,5,8,5,3), q);
        Quadrangle.addToTab(new Quadrangle(42,13,6,7,8,3,42,2), q);
        Quadrangle.printTab(q);
        Quadrangle.sortTab(q);
        Quadrangle.printTab(q);
    }
    
}
