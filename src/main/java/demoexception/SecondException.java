package demoexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SecondException {

    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void method() throws FileNotFoundException {
        File file = new File("text.txt");
        FileReader fr = new FileReader(file);


    }

    public static void   something() {

    }
}
