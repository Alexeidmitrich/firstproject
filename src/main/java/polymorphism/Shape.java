package polymorphism;

public abstract class Shape {

    public abstract void perimetr();

    public abstract void area();

    public void method(){
        System.out.println("!");
    }
    //В а,страктном классе могут ,ыть как о6ычные методы, так и а6страктные
    //В а6страктном классе могут и не 6ыть а7страктные методы
    //Но а6страктные методы о6язаны 6ыть в а6стрвактном классе
    //О6]ект а6страктного класса создавать запрещено
}
