/**
 * @author chen
 */
import java.util .Scanner;
public class hex2Dec {
    public static void main(String[] args) {
        try {
            // Create a Scanner
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter a string
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();
            int decimalValue = 0;

            for (int i = 0; i < hex.length(); i++) {
                char hexChar = hex.charAt(i);
                int x;
                if (hexChar >= 'A' && hexChar <= 'F') {
                    x= 10 + hexChar - 'A';
                } else if (hexChar >= '0' && hexChar <= '9')
                {
                    x= hexChar - '0';
                } else {
                    throw new HexFormatException("请输入正确的十六进制数");
                }

                decimalValue = decimalValue * 16 + x;
            }
            System.out.println("The decimal value for hex number " +
                    hex + " is " + decimalValue);
        }
        catch (HexFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static class HexFormatException extends Exception
    {
        public HexFormatException(String ErrorMessage)
        {
            super(ErrorMessage);
        }
    }

}
