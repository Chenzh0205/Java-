import java.util.Scanner;
/**
 * @author chen
 */
public class judeRectangle {
        public static void main(String[] args) {
            //提示用户输入点
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a point with two coordinates: ");
            double x = input.nextDouble();
            double y = input.nextDouble();

            //计算是否在矩形内,并输出
            if(-5<=x && x<=5 && -2.5<=y && y<=2.5) {
                System.out.print("Point (" + x + ", " + y + ") is in the rectangle");
            } else {
                System.out.print("Point (" + x + ", " + y + ") is not in the rectangle");
            }
    }
}
