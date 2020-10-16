import java.util.Arrays;
import java.util.Scanner;
/**
 * @author chen
 */
public class occursTime {
    public static void main (String[] args) {
        System.out.println("Enter the integers between 1 and 100: ");
        Scanner input = new Scanner(System.in);
        int number;
        int[] a = new int[101];
        number= input.nextInt();
        while(number!=0) {
            number= input.nextInt();
            a[number]=a[number]+1;
        }
        for (int i =1 ;i < a.length; i++){
            if(a[i]==1) {
                System.out.println(i+" occurs "+a[i]+" time");
            }
            else if (a[i]>1){
                System.out.println(i+" occurs "+a[i]+" times");
            }


        }








    }
}
