public class Rhombus {

    public Rhombus() {
    }
    
    public static double calcRadius(double side, double alpha){
        double rad = alpha * Math.PI/180;
        double radius = 1/2.*side *Math.sin(alpha);
        return radius;

    }
}

    

