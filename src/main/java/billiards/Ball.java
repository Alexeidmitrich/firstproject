package billiards;

public class Ball {
    int x;
    int y;

    public void down(){
        System.out.println("Шар движется вниз");
    }
    public void up(){
        System.out.println("Шар движется вверх");
    }
    public void left(){
        System.out.println("Шар движется влево");
    }
    public void right(){
        System.out.println("Шар движется вправо");
    }
    public  void freedom(int x, int y){
        System.out.println("Шар перемещается в точку " + x + ", " + y);
        this.x = x;
        this.y = y;
    }
}
