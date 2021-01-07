import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author chen
 */
public class practice11_13{
    public static void main(String[] args){
        System.out.println("Enter ten integers: ");
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        for (int i=0;i<10;i++){
            list.add(input.nextInt());
        }
        removeDuplicate(list);
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i=1;i< list.size();i++){
            for (int j=0;j<i;j++){
                if (list.get(i)==list.get(j)){
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}