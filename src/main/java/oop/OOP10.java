package oop;

public class OOP10 {
    int arr[];

    public OOP10(int[] arr) {
        this.arr = arr;
    }

    public String Boom() {
        String b="В массиве нет 7";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                b = "Бум";
            }
        }
            return b;
        }
    }

