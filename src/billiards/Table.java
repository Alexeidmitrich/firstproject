package billiards;

public class Table {
    int length;
    int width;
    Ball ball;

    public Table(int length, int width){
        this.width = width;
        this.length = length;
    }
    public void setBall(Ball ball) {
        this.ball = ball;
    }
    public static void main(String[] args) {
        Table table = new Table(300, 150);
    }
}

