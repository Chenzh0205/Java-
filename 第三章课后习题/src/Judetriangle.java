import java.math.*;
import java.util.Scanner;
/**
 * @author chen
 */
public class Judetriangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point's x- and y- coordinates: ");
        double x =input.nextDouble();
        double y =input.nextDouble();
        if( 2*y+x<200 & x>0 & y>0){
            System.out.println("The point is in the triangle");
        }
        else{
            System.out.println("The point is not in the triangle");
        }



    }
}
