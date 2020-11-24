
import java.util.*;
public class Practice9_11{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();
    LinearEquation le=new LinearEquation(a,b,c,d,e,f);
    if(le.isSolvable()){
        System.out.println(le.getX()+" "+le.getY());
    }
    else {
        System.out.println("The equation has no solution");
    }
}
static class LinearEquation{
    private double a,b,c,d,e,f;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    LinearEquation(double x1,double x2,double x3,double x4,double x5,double x6){
        a=x1;b=x2;c=x3;d=x4;e=x5;f=x6;
    }
    public boolean isSolvable(){
        if ((a * d - b * c) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}


}


