package bookshop;


public class Magazine extends PrintEdition{

    public Magazine(String title, int article, int price, int numberPlace) {
        super(title, article, price, numberPlace, "газетный");
    }


}
