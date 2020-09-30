/*
  @author chen
 */
import java.math.*;
import java.util.Scanner;
public class Pickcard {
    public static void main (String[] args) {
        int card = (int)(Math.random()*14);
        //随机生成一张牌 A-K
        int dyestuff = (int)(Math.random()*5);
        //随机生成4种花色其中一种

        switch(card) {
            case 1: System.out.print("The card you picked is Acec of ");break;
            case 2: System.out.print("The card you picked is 2 of ");break;
            case 3: System.out.print("The card you picked is 3 of ");break;
            case 4: System.out.print("The card you picked is 4 of ");break;
            case 5: System.out.print("The card you picked is 5 of ");break;
            case 6: System.out.print("The card you picked is 6 of ");break;
            case 7: System.out.print("The card you picked is 7 of ");break;
            case 8: System.out.print("The card you picked is 8 of ");break;
            case 9: System.out.print("The card you picked is 9 of ");break;
            case 10: System.out.print("The card you picked is 10 of ");break;
            case 11: System.out.print("The card you picked is Jack of ");break;
            case 12: System.out.print("The card you picked is Queen of ");break;
            case 13: System.out.print("The card you picked is King of ");break;
            default:System.exit(1);
        }

        switch(dyestuff) {
            case 1:System.out.println("Clubs");break;
            case 2:System.out.println("Diamonds");break;
            case 3:System.out.println("Hearts");break;
            case 4:System.out.println("Spades");break;
            default:System.exit(1);
        }


    }
}
