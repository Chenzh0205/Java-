import java.util.Arrays;
import java.util.Scanner;
/**
 * @author chen
 */
public class listSort {
    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int size = input.nextInt();
        int[] list =new int[size];
        int[] list2 =new int[list.length];
        System.out.println("Enter the contents of the list: ");
        for (int i=0;i<list.length;i++)
        {
            list[i]= input.nextInt();
        }

        for (int i=0;i< list.length;i++)
        {
            list2[i]=list[i];
        }
        if (isSorted(list,list2))
        {
            System.out.println("\nThe list is already sorted");
        }
        else {
            System.out.println("\nThe list is not sorted");
        }
    }
    public static boolean isSorted(int[] list,int[] list2)
    {
        if (Arrays.equals(list2,bubble(list))){
            return true;
        }
        return false;
    }

    public static  int[] bubble(int[] list){
        for (int i=0;i<list.length;i++)
        {
            for (int j=0;j< list.length-1-i;j++)
            {
                if (list[j]>list[j+1]){
                    int temp=list[i];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        return list;
    }
}