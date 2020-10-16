import java.lang.*;
import java.util.*;
import java.math.*;
/**
 * @author chen
 */
public class Bubblesort {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        Double[] number = new Double[10];
        for (int i=0;i<10;i++)
        {
            number[i] = input.nextDouble();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(number[j]<number[j+1])
                {
                    double temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
        }
        for (int i=0;i<10;i++)
        {
            System.out.println(number[i]);
        }
    }
}
