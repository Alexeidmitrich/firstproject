package training;//Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод. Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class New5 {
    static Random random=new Random();
    static Scanner in=new Scanner(System.in);
    public static int randomInt(){
        int a=random.nextInt(Calk()-(0)+1)+(0);
return a;
    }
    public static int Calk(){
        int l=0;
        int y=0;
        int n=0;
        if(y==0){
        System.out.println("Введите число больше 3");
        n=in.nextInt();
        while (n<3&&n==3){
            System.out.println("Введите число ещё раз");
            n=in.nextInt();}
        y++;}
        l=n;
        return l;
    }
    public static void main(String[] args) {
        int[] arr=new int[Calk()];
        int i=0;
        while (i< arr.length){
            arr[i]=randomInt();
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
