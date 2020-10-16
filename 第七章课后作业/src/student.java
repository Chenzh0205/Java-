import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author chen
 */
public class student {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter numbers: ");
    int number = input.nextInt();
    String[] name = new String[number];
    int[] grade = new int[number];
    System.out.println("Enter name and grade: ");
    for (int i=0;i<number;i++)
    {
        name[i]=input.next();
        grade[i]=input.nextInt();
    }
    for(int i=0;i<number-1;i++)
    {
        for(int j=0;j<number-1-i;j++)
        {
            if(grade[j]>grade[j+1])
            {
                int temp=grade[j];
                grade[j]=grade[j+1];
                grade[j+1]=temp;
                String temp_c=name[j];
                name[j]=name[j+1];
                name[j+1]=temp_c;
            }
        }
    }
    for (int i=0;i<number;i++)
    {
        System.out.println("name is "+name[i]);

    }


    }
}
