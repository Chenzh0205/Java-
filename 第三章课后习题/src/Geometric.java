/*
  @author chen
 */
import java.math.*;
import java.util.Scanner;
public class Geometric {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: ");
        float x = input.nextFloat();
        float y = input.nextFloat();
        double distance = Math.sqrt(x*x+y*y);

        if(distance > 10) {
            System.out.println("Point("+x+","+y+") is not in the circle");
        }
        else {
            System.out.println("Point("+x+","+y+") is  in the circle");
        }

    }
}
