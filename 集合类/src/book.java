import java.util.*;
/**
 * @author chen
 */
public class book {
    public static void main(String[] args) {
        Books book1 = new Books(1001, "Java", 888.0, "工业出版社");
        Books book2 = new Books(1002,"Python",128.0,"铁道出版社");
        Books book3 = new Books(1003,"C语言程序设计与数据结构",205.0,"工业设计出版社");
        HashMap<Integer, Books> booksHashMap=new HashMap<>();
        booksHashMap.put(book1.getNum(),book1);
        booksHashMap.put(book2.getNum(), book2);
        booksHashMap.put(book3.getNum(), book3);

        List<HashMap<Integer, Books>> booksList=new ArrayList<>();
        booksList.add(booksHashMap);

        System.out.println("编号\t名称\t单价\t出版社");
        for (HashMap<Integer, Books> h:booksList){
            Set<Integer> key =h.keySet();
            for (Integer i:key){
                System.out.println(i
                +"\t"+h.get(i).getName()
                +"\t"+h.get(i).getPrice()
                +"\t"+h.get(i).getPress());
            }
        }
    }


    static class Books {
        /**
         * num 编号
         * name 名称
         * price 价格
         * press 出版社
         */
        private int num;
        private String name;
        private double price;
        private String press;

        public Books() {

        }

        Books(int num, String name, double price, String press) {
            super();
            this.num = num;
            this.name = name;
            this.price = price;
            this.press = press;
        }

        int getNum() {
            return num;
        }

        String getName() {
            return name;
        }

        double getPrice() {
            return price;
        }

        String getPress() {
            return press;
        }

    }
}