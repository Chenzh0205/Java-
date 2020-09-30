/**
 * @author chen
 */
import java.util.Scanner;
public class Triangle {
    public static void main (String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter s1 , s2 , s3 : ");
            double s1 = input.nextDouble();
            double s2 = input.nextDouble();
            double s3 = input.nextDouble();

            if(s1 == 0 || s2 == 0 || s3 == 0)
            {
                System.out.println("illegal");
                System.exit(1);
            }
            //如果其中一条边长为0，则终止程序
            if(s1+s2 > s3)
            {
                System.out.println("The triangle circumference is:"+ (s1+s2+s3));
            }
            else if(s1+s3 >s2)
            {
                System.out.println("The triangle circumference is:"+ (s1+s2+s3));
            }
            else if(s2+s3 >s1)
            {
                System.out.println("The triangle circumference is:"+ (s1+s2+s3));
            }
            else
            {
                System.out.println(" illegal ");
            }

        }
}