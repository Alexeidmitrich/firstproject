package newes;
public class New9 {
    int number;
    String destination;
    int time;
    int a[];

    public New9(int a,int b,String c, int[] arr) {
        number = b;
       destination = c;
        this.a = arr;
    }
    public String Train() {
        for (int i = 0; i < a.length; i++) {
            if (number == 1) {
                return "Поезд номер 1. Пункт назначения: Москва. Время отправления: 20*05. Перрон №3.Правая сторона.";
            } else if (number == 95) {
                return "Поезд номер 95. Пункт назначения: Минск. Время отправления: 19*36. Перрон №2.Правая сторона.";
            } else if (number == 44) {
                return "Поезд номер 44. Пункт назначения: Псков. Время отправления: 19*45. Перрон №1.Левая сторона.";
            }
        }
        return null;
    }
    public String Dest(){
        int index=0;
        for (int i = 0; i < a.length; i++) {
        if (destination == "Москва") {
                return "Поезд номер 1. Пункт назначения: Москва. Время отправления: 20*05. Перрон №3.Правая сторона.";
            } else if (destination == "Минск") {
                return "Поезд номер 95. Пункт назначения: Минск. Время отправления: 19*36. Перрон №2.Правая сторона.";
            } else if (destination == "Псков") {
                return "Поезд номер 44. Пункт назначения: Псков. Время отправления: 19*45. Перрон №1.Левая сторона.";
            } else {
                return "";
            }
        }
        return null;
    }
}







