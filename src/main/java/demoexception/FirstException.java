package demoexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstException {


    public static Matcher isPatternMatches(String command, String regex){
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(command);
        return matcher;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*try {
           System.out.println("Enter a number");
           int x = sc.nextInt();
           System.out.println(x);
           int [] a = {3,5,6};
           System.out.println(a[56]);
       } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
          ex.printStackTrace();
       } finally {
           System.out.println("Always");
       }


        */
        System.out.println("!!!!!");
        System.out.println("Enter a number");
        String x = sc.nextLine();
        String regex = "^[0-9]+$";
        Matcher matcher = isPatternMatches(x, regex);
        if (matcher.find()) {
            int x1 = Integer.parseInt(x);
            System.out.println(x1);
        } else {
            System.out.println("Number is invalid");
        }

        /*System.out.println(x);
        int [] a = {3,5,6};
        System.out.println(a[56]);

        int [] a = {3,5,6};
        if(a.length > 56) {
            System.out.println(a[56]);
        }
        for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);

        }
        File file = new File("text.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Another code");

        */
    }
}
