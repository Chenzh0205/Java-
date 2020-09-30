/**
 * @author chen
 */
import java.util.Scanner;
public class Isbn {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int num = scan.nextInt();
        int n = 9;
        int temp = num;
        //将输入的值复制一份
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10 * n;
            //n既参与了公式的计算，又确定了0的个数
            temp /= 10;
            n--;
            //退出循环时，n的值就是0的个数
        }
        System.out.print("The ISBN-10 number is ");
        for (int i = n; i > 0; i--) {
            System.out.print(0);
            //先输出前面的0
        }
        System.out.print(num);
        if (sum % 11 == 10) {
            //输出最后一位
            System.out.print("X");
        } else {
            System.out.print(sum % 11);
        }
        scan.close();
    }
    }
