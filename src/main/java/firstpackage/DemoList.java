package firstpackage;


import java.util.ArrayList;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("Hello");
        list.add("This is a string");
        list.add("!!!!");
        list.remove("Hello");
        //System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
          //  System.out.println(list.get(i));
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(10);
        list2.add(15);
        list2.add(0, 77);
        list2.add(2, -87);
        //list2.remove(0);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        List<Double> list1 = new ArrayList<>();
    }
}
