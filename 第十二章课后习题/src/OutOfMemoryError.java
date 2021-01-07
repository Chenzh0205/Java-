import java.security.cert.Extension;
import java.util.*;
import java.util.concurrent.ExecutionException;
public class OutOfMemoryError {
    public static void main(String[] args){
        try{
            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < 100000000; i++) {
                String temp = ("adfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfadf" + i).intern();
                list.add(temp);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}