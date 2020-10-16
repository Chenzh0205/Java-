import java.util.Scanner;

/**
 * @author chen
 */
public class exercise7_31 {
    public static void main (String[] args) {
        System.out.println("Enter list1: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int[] list1 = new int[num1];
        for (int i=0;i<num1;i++)
        {
            list1[i]= input.nextInt();
        }
        System.out.println("Enter list2: ");
        int num2 = input.nextInt();
        int[] list2 = new int[num2];
        for (int i=0;i<num2;i++)
        {
            list2[i]= input.nextInt();
        }
        int[] list3=new int[list1.length+ list2.length];
        for (int i=0;i< list1.length;i++)
        {
            list3[i]=list1[i];
        }
        for (int i= list1.length;i< list3.length;i++)
        {
            list3[i]=list2[i- list1.length];
        }
        java.util.Arrays.sort(list3);
        System.out.println("The merged list is: ");
        for (int i=0;i< list3.length;i++)
        {
            System.out.print(list3[i]+" ");
        }
    }
}



