package dz;

public class DZ8 {
    String c;
    String d;

    public DZ8(String a, String b) {
        c = a;
        d = b;
    }

    public String Vibor() {
        if (c.equals("Бумага") && d.equals("Камень")) {
            return "Победил первый игрок";
        } else if (c.equals("Камень") && d.equals("Бумага")) {
            return "Победил второй игрок";
        } else if (c.equals("Камень") && d.equals("Ножницы")) {
            return "Победил первый игрок";
        } else if (c.equals("Ножницы") && d.equals("Камень")) {
            return "Победил второй игрок";
        } else if (c.equals("Бумага") && d.equals("Ножницы")) {
            return "Победил второй игрок";
        } else if (c.equals("Ножницы") && d.equals("Бумага")) {
            return "Победил первый игрок";
        } else if (c.equals("Камень") && d.equals("Камень")) {
            return "Ничья";
        } else if (c.equals("Бумага") && d.equals("Бумага")) {
            return "Ничья";
        } else if (c.equals("Ножницы") && d.equals("Ножницы")) {
           return "Ничья";
        } else {
            return "Error";
        }
    }
}
