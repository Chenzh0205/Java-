import java.util.Scanner;
/**
 * @author chen
 */
public class SalesTax {
    public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter purchase amout: ");
       double purchasesAmount = input.nextDouble();
       double tax = purchasesAmount *0.06;
       System.out.println("Sales tax is $"+(int)(tax*100)/100.0);

    }
}