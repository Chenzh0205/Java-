import java.util.Arrays;
import java.util.Scanner;
/**
 * @author chen
 */
public class sortstr{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(sort(str));
    }
    public static String sort(String s)
    {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}