/**
 * @author chen
 */

import java.util.Scanner;

public class practice11_9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size n:");
        int n= input.nextInt();
        int[][] a= new int[n][n];
        System.out.println("The random array is ");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                a[i][j]=(int)(Math.random()*2);
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("The largest row index: "+max(a,true));
        System.out.println("The largest column index: "+max(a,false));
    }
    private static int max(int[][] array,boolean rowCol){
        int max;
        int temp=0,count=0;
        for (int i=0;i<array.length;i++){
            max=0;
            for (int j=0;j<array[i].length;j++){
                int index=(rowCol)?array[i][j]:array[j][i];
                if (index==1) {
                    max++;
                }
            }
            if (temp<max){
                temp=max;
                count=i;
            }
        }
        return count+1;
    }
}