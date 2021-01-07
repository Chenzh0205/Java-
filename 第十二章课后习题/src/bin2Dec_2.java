/**
 * @author chen
 */
import java.util .Scanner;
public class bin2Dec_2 {
    public static void main(String[] args) {

        try {
            // Create a Scanner
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter a string
            System.out.print("Enter a binary number: ");
            String binary = input.nextLine();
            int decimalValue = 0;
            int x = 0;
            for (int i = 0; i < binary.length(); i++) {
                char binaryChar = binary.charAt(i);
                if (binaryChar =='0'||binaryChar =='1') {
                    x = binaryChar-'0';
                }
                else {
                    throw new BianryFormatException("请输入正确的二进制数");
                }
                decimalValue = decimalValue * 2 + x;
            }

            System.out.println("The decimal value for binary number " +
                    binary + " is " + decimalValue);
        } catch (BianryFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static class BianryFormatException extends Exception
    {
        public BianryFormatException(String ErrorMessage)
        {
            super(ErrorMessage);
        }
    }

}
