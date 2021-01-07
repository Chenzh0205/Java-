/**
 * @author chen
 */
import java.util .Scanner;
public class bin2Dec {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a string
        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();
        try {
            System.out.println("The decimal value for binary number " +
                    binary + " is " + binaryToDecimal(binary.toUpperCase()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int binaryToDecimal(String binary) {
        int decimalValue = 0;

        for (int i = 0; i < binary.length(); i++) {
            char binaryChar = binary.charAt(i);
            decimalValue = decimalValue * 2 + binaryCharToDecimal(binaryChar);
        }

        return decimalValue;
    }

    public static int binaryCharToDecimal(char ch) {
        if (ch =='0') {
            return 0;
        } else if (ch =='1') {
            return 1;
        } else {
            throw new NumberFormatException("请输入正确的二进制数");
        }
    }
}
