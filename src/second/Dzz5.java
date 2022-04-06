package second;

import java.util.*;

public class Dzz5 {
    public static void main(String[] args) {
        //  String[] a = {"Hello", "Good bye", "See soon"};
        //   massiv(a);
        // date();
        //  word();
        // summ();
        //  test();
        // mass1();
        //    massiv();
        findList();
        //listic();
        System.out.println();
        System.out.println(sum(3,8));
        /*
        String a = "mb";
        String b = "bc";
        System.out.println(a.compareTo(b));*/
    }

    public static void massiv(String[] a) {
        for (int i = a.length - 1; i >= 0; --i) {
            System.out.print(a[i] + " ");
        }
    }

    public static void date() {
        String[] b = {"Hello", "Every day", "See soon", "Open", "Angry"};
        int i = 0;
        for (String str : b) {
            boolean test = str.matches("^(?i:[aeiouy]).*");
            while (test == true) {
                System.out.print(str + " ");
                break;
            }
        }
    }

    public static void word() {
        System.out.println();
        String s = "Hello";
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            System.out.println(x);
        }
    }

    public static void summ() {
        String a[] = {"Hello", "PP", "AAA", "65cdaxsCSD", " : ", "789"};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i].length() + " ");
        }
    }

    public static void test() {
        System.out.println();
        String s = "Hello";
        String replStr1 = s.replace('e', 'k');
        System.out.println(replStr1);
        String replStr2 = s.replaceAll("l", "!");
        System.out.println(replStr2);
        String replStr3 = s.substring(2, 5);
        System.out.println(replStr3);
        String replStr4 = s.substring(1, 4);
        System.out.println(replStr4);
        int replStr5 = s.indexOf('H');
        if (replStr5 >= 0) {
            System.out.println("Буква H в строке есть");
        } else {
            System.out.println("Буквы H в строке нет");
        }
    }

    public static void massiv() {
        String a[] = {"aaa", "bab", " cccc ", " ccz "};
        String b[] = {"abb", "abc ", " ccac ", " ckz ", "dea ", "mp", "upc"};
        String result[] = new String[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) < 0) {
                result[k] = a[i];
                k++;
                i++;
            }

            System.out.println(Arrays.toString(b));
        }
    }

    public static void mass1() {
        String s = "Hello";
        String s1 = "hello";
        if (s.equals(s1)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        if (s.equalsIgnoreCase(s1)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
    }

    public static void findList() {
        List<Integer> list = new ArrayList<>();
        list.add(77);
        list.add(89);
        list.add(32);
        list.add(100);
        list.add(13);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (int i = list.size() - 1; i >= 0; --i) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.add(2, 66);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.add(0, -8);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.remove(4);
        list.remove(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        List<Integer> list2 = new ArrayList<>();
        list2.add(26);
        list2.add(-90);
        list2.add(21);
        list2.add(45);
        list2.add(78);
        list2.addAll(list);
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) % 2 == 0) {
                System.out.print(list2.get(i) + " ");
            }
        }
        System.out.println();
        list2.clear();
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }

    public static void listic() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Postgres");
        list.add("Mongo");
        list.add("Python");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            int result = list.get(i).length();
            System.out.print(result + " ");
        }
        System.out.println();
        Collections.sort(list);
        for (String str : list) {
            System.out.print(str + " ");
        }
        System.out.println();
        for (String str : list) {
            boolean test = str.matches("^(?i:[P]).*");
            if (test) {
                System.out.print(str + " ");
            }
        }
    }

    public static int sum(int n){
        return  n * (n + 1) / 2;
    }
    public static int sum(int i, int n) {// sum(5,8)
        return  sum(n) - sum(i - 1);
    }
    // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8   8 * 9 /2

    //                 5 + 6 + 7 + 8
}

// 1 + 2 + 3 +4 + 5  =15
//1 + 2 + 3 = 6
//15 - 6 = 9 = 4 + 5




