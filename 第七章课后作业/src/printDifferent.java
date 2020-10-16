import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author chen
 */
public class printDifferent {
    public static void main (String[] args) {
        System.out.println("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        int[] number = new int[10];
        int[] distinct = new int[10];
        int count=0,i,j;
        Arrays.fill(distinct,-1);
        for (i=0;i<10;i++){
            number[i]=input.nextInt();
        }
        for (i=0;i<10;i++){
            for (j=i+1;j<10;j++){
                if(number[i]==number[j]){
                    number[j]=0;
                }
            }
        }
        for (i=0,j=0;i<10;i++){
            if(number[i]!=0){
                distinct[j]=number[i];
                j++;
                count++;
            }
        }
        System.out.println("The number of distinct numbers is "+count+"\nThe distinct numbers are : ");
        for (i=0;i<count;i++)
        {
            System.out.print(distinct[i]+" ");
        }



    }
}
